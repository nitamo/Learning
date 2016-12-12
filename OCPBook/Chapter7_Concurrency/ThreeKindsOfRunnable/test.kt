import java.util.concurrent.*

class SimpleRunnable : Runnable {
	override fun run() = println("I'm a humble simple Runnable extension. I'm a class")
}

class ThreadExtension : Thread() {
	override fun run() {
		println("I'm a Thread extension class")
		(1..10).forEach { println(it) }
	}
}

fun main(args : Array<String>) {
	val t1 = Thread(SimpleRunnable())
	val t2 = Thread { println("I'm a lambda runnable!") }
	val t3 = ThreadExtension()

	t1.start()
	t2.start()
	t3.start()
}
