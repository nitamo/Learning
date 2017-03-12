interface Proxy {
	fun show() : String
}

interface Receiver {
	fun send(str : String)
}

class Mirror(val obj : Receiver) : Proxy {
	private val src = Source()
	private var result = "Not ready...waiting..."

	override fun show() : String {
		Thread {
			result = src.show()
			obj.send(result)
		}.start()

		return result
	}
}

class Source : Proxy {
	override fun show() : String {
		Thread.sleep(10000)
		return "Data downloading complete!"
	}
}

class Display : Receiver {
	var text = ""
	fun show() {
		while(true) {
			println(text)
			Thread.sleep(2000)
		}
	}

	override fun send(str : String) {
		text = str
	}
}

fun main(args : Array<String>) {
	val display = Display()
	val mirror = Mirror(display)
	display.send(mirror.show())
	display.show()
}
