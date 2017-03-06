interface TrafficLightsState {
	fun showLightToCars()
	fun showLightToPedestrians()
	fun beep()
	fun change()
}

class RedToCars(val lights : TrafficLights) : TrafficLightsState {
	override fun showLightToCars() = println("RED to cars")
	override fun showLightToPedestrians() = println("GREEN to pedestrians")
	override fun beep() = println("Beep...beep...beep...")
	override fun change() {
		showLightToCars()
		showLightToPedestrians()
		beep()
		Thread.sleep(5000)
		lights.state = lights.greenToCars
	}
}

class GreenToCars(val lights : TrafficLights) : TrafficLightsState {
	override fun showLightToCars() = println("GREEN to cars")
	override fun showLightToPedestrians() = println("RED to pedestrians")
	override fun beep() {}
	override fun change() {
		showLightToCars()
		showLightToPedestrians()
		Thread.sleep(5000)
		lights.state = lights.redToCars
	}
}

class TrafficLights {
	var state : TrafficLightsState
	val redToCars : TrafficLightsState
	val greenToCars : TrafficLightsState

	constructor() {
		redToCars = RedToCars(this)
		greenToCars = GreenToCars(this)
		state = redToCars
	}

	fun start() {
		while(true) {
			for(i : Int in 1..19) print("=")
			println("=")
			state.change()
		}
	}
}


fun main(args : Array<String>) {
	val lights = TrafficLights()
	lights.start()
}
