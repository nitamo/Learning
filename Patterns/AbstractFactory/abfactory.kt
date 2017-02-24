data class CarOrder(val name : String, val producer : CarFactory)

abstract class CarFactory {
	abstract fun makeChassis()
	abstract fun makeEngine()
	abstract fun makeElectronics()
}

class FamilyCarFactory : CarFactory() {
	override fun makeChassis() = println("Family car chassis is ready")
	override fun makeEngine() = println("Family car engine is ready")
	override fun makeElectronics() = println("Family car electronics is ready")
}

class SUVFactory : CarFactory() {
	override fun makeChassis() = println("SUV chassis is ready")
	override fun makeEngine() = println("SUV engine is ready")
	override fun makeElectronics() = println("SUV car electronics is ready")
}

class CarOrderProcessor {
	fun orderCar(order : CarOrder) {
		println("Preparing a new car: ${order.name}")
		Thread.sleep(3000)
		val carFactory = order.producer
		carFactory.makeChassis()
		Thread.sleep(1000)
		carFactory.makeEngine()
		Thread.sleep(1000)
		carFactory.makeElectronics()
		Thread.sleep(1000)
		println("Your car is ready!")
	}
}

fun main(args : Array<String>) {
	val orderProcessor = CarOrderProcessor()
	orderProcessor.orderCar(CarOrder("My family car", FamilyCarFactory()))
	orderProcessor.orderCar(CarOrder("My large SUV", SUVFactory()))
}
