class RoomLight {
	fun turnLightOn() = println("Room light is on")
	fun turnLightOff() = println("Room light is off")
}

class RoomThermometer {
	fun turnHeatingOn() = println("Heating is on")
	fun turnHeatingOff() = println("Heating is off")
	fun setNormalTemp() = println("Temperature is set to 20 degrees")
}

class AudioPlayer {
	fun turnMusicOn() = println("Music is playing")
	fun turnMusicOff() = println("Music is silent")
	fun setNormalSoundLevel() = println("Sound volume is set to 5")
}

//Facade class
class RoomController(val light : RoomLight, val thermo : RoomThermometer, val player : AudioPlayer) {
	fun enterRoom() {
		light.turnLightOn()
		thermo.turnHeatingOn()
		thermo.setNormalTemp()
		player.turnMusicOn()
		player.setNormalSoundLevel()
	}

	fun leaveRoom() {
		player.turnMusicOff()
		thermo.turnHeatingOff()
		light.turnLightOff()
	}
}

fun main(args : Array<String>) {
	val roomFacade = RoomController(RoomLight(),
					RoomThermometer(),
					AudioPlayer())
	
	println("Entering the room...")
	roomFacade.enterRoom()
	println()

	Thread.sleep(5000)
	println("Leaving the room...")
	roomFacade.leaveRoom()
}
