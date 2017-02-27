interface Animal {
	fun walk()
	fun bellow()
}

interface Bird {
	fun fly()
	fun scream()
	fun walk()
}

class Bull : Animal {
	override fun walk() = println("Bull walks")
	override fun bellow() = println("Bull mooes")
}

class Penguin : Bird {
	override fun fly() = throw UnsupportedOperationException("The penguins cannot fly")
	override fun walk() = println("Penguin walks")
	override fun scream() = println("Penguin screams")
}

class BirdToAnimalAdapter : Animal {
	val bird : Bird

	constructor(bird : Bird) {
		this.bird = bird
	}

	override fun walk() = bird.walk()
	override fun bellow() = bird.scream()
}

fun main(args : Array<String>) {
	val bull = Bull()
	bull.walk()
	bull.bellow()

	val penguin = Penguin()
	penguin.walk()
	penguin.scream()

	val adaptedPenguin : Animal = BirdToAnimalAdapter(penguin)
	adaptedPenguin.walk()
	adaptedPenguin.bellow()
}
