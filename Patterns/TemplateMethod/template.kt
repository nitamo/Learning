enum class HullColor(val color: String) {
	BLACK("Black"), WHITE("White"), RED("Red"), GREEN("Green"), BLUE("Blue");

	override fun toString() = color
}

abstract class AbstractCarBuilder {
	fun buildCar() {
		println("Car construction started...")
		Thread.sleep(1000)
		placeHull()
		Thread.sleep(1000)
		paintHull()
		Thread.sleep(1000)
		setEngine()
		Thread.sleep(1000)
		attachWheels()
	}

	abstract fun placeHull()
	abstract fun setEngine()
	abstract fun attachWheels()

	open fun paintHull() = println("Painting in ${HullColor.BLACK}")
}

class FamilyCarBuilder : AbstractCarBuilder() {
	override fun placeHull() = println("Placing a small family car hull")
	override fun setEngine() = println("Setting 120HP engine for a new family car")
	override fun attachWheels() = println("Attaching 15\" wheels")

	override fun paintHull() = println("Painting a new family car in ${HullColor.RED}")
}

class SUVCarBuilder : AbstractCarBuilder() {
	override fun placeHull() = println("Placing a large SUV hull")
	override fun setEngine() = println("Setting a huge 250HP engine for a new SUV")
	override fun attachWheels() = println("Attaching 21\" wheels")
}

fun main(args : Array<String>) { 
	val familyCar = FamilyCarBuilder()
	val suv = SUVCarBuilder()

	familyCar.buildCar()
	suv.buildCar()
}
