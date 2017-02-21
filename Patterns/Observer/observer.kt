interface Observable {
	fun addObserver(o : Observer) : Unit
	fun removeObserver(o : Observer) : Unit
	fun notifyObservers() : Unit
}

interface Observer {
	fun update(m : Message) : Unit
}

data class Message(val msg : String)

class WeatherStation : Observable {
	val observersList = mutableListOf<Observer>()
	var msg = Message("Empty")

	override fun addObserver(o : Observer) : Unit { observersList.add(o) }
	override fun removeObserver(o : Observer) : Unit { observersList.remove(o) }
	override fun notifyObservers() : Unit {
		for(observer in observersList) {
			observer.update(msg)
		}
	}

	fun sendMessage(msg : Message) : Unit {
		this.msg = msg
		notifyObservers()
	}
}

class Radio : Observer {
	override fun update(m : Message) : Unit {
		println("The radio station is broadcasting: \"${m.msg}\"")
	}
}

class TV : Observer {
	override fun update(m : Message) : Unit {
		println("The TV repeats: \"${m.msg}\"")
	}
}

fun main(args : Array<String>) {
	val weatherStation = WeatherStation()
	val radio = Radio()
	val tv = TV()

	weatherStation.addObserver(radio)
	weatherStation.addObserver(tv)

	val msg1 = Message("The weather is fine, go outside.")

	weatherStation.sendMessage(msg1)
}
