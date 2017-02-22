abstract class Beverage {
	var description : String = "Unknown beverage"

	abstract fun cost() : Double
}

class Coffee : Beverage {
	constructor() {
		description = "Coffee"
	}

	override fun cost() : Double = 0.5
}

class Cappuchino : Beverage {
	constructor() {
		description = "Cappuchino"
	}

	override fun cost() : Double = 1.5
}

class Milk : Beverage {
	var beverage : Beverage

	constructor(bev : Beverage) {
		beverage = bev
		description = "${bev.description}, Milk"
	}

	override fun cost() : Double {
		return 0.1 + beverage.cost()
	}
}

class Chocolate : Beverage {
	var beverage : Beverage

	constructor(bev : Beverage) {
		beverage = bev
		description = "${bev.description}, Chocolate"
	}

	override fun cost() : Double {
		return 0.5 + beverage.cost()
	}
}

class Mocha : Beverage {
	var beverage : Beverage

	constructor(bev : Beverage) {
		beverage = bev
		description = "${bev.description}, Mocha"
	}

	override fun cost() : Double {
		return 0.9 + beverage.cost()
	}
}

fun main(args : Array<String>) {
	val bev1 = Chocolate(Milk(Coffee()))
	println("Your beverage ${bev1.description} for ${bev1.cost()} is ready.")

	val bev2 = Mocha(Cappuchino())
	println("Your beverage ${bev2.description} for ${bev2.cost()} is ready.")
}
