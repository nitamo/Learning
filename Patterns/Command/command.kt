interface Command {
	fun execute()
}

class Light(var name : String) {
	fun on() = println("Light in $name is ON")
	fun off() = println("Light in $name is OFF")
}


class Door(var name : String) {
	fun openDoor() = println("Door in $name is OPEN")
	fun closeDoor() = println("Door in $name is CLOSED")
}

object House {
	val kitchenLight = Light("Kitchen")
	val garageDoor = Door("Garage")
}

class switchKitchenLightOnCommand : Command {
	override fun execute() = House.kitchenLight.on()
}

class switchKitchenLightOffCommand : Command {
	override fun execute() = House.kitchenLight.off()
}

class openGarageDoorCommand : Command {
	override fun execute() = House.garageDoor.openDoor()
}

class closeGarageDoorCommand : Command {
	override fun execute() = House.garageDoor.closeDoor()
}

class HouseRemoteControl {
	var cmdCounter : Int = 0
	fun doIt(cmd : Command) { 
		cmd.execute()
		cmdCounter++
	}

	fun getStats() = cmdCounter
}

fun main(args : Array<String>) { 
	val remote = HouseRemoteControl()
	remote.doIt(openGarageDoorCommand())
	remote.doIt(closeGarageDoorCommand())
	remote.doIt(switchKitchenLightOnCommand())
	remote.doIt(switchKitchenLightOffCommand())
	println("${remote.getStats()} commands executed.")
}
