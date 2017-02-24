data class Pizza(val name : String)

abstract class PizzaStore {
	abstract fun createPizza(name : String) : Pizza

	fun orderPizza(name : String) : Pizza {
		println("\tCreating the new pizza for you...")
		val pizza = createPizza(name)
		Thread.sleep(2000)
		println("\tPacking your pizza")
		Thread.sleep(1000)
		println("\tPizza is ready!")
		return pizza
	}
}

class NYPizzaStore : PizzaStore() {
	override fun createPizza(name : String) : Pizza {
		return when (name) {
			"cheese" -> Pizza("NY standard cheese pizza")
			"mozarella" -> Pizza("NY mozarella pizza")
			"pepperoni" -> Pizza("NY pepperoni pizza")
			else -> throw IllegalArgumentException("Wrong pizza name")
		}
	}
}

class LAPizzaStore : PizzaStore() {
	override fun createPizza(name : String) : Pizza {
		return when (name) {
			"cheese" -> Pizza("LA mega cheesy pizza")
			"mozarella" -> Pizza("LA new mozarella pizza")
			"pepperoni" -> Pizza("LA the spiciest pepperoni pizza")
			else -> throw IllegalArgumentException("Wrong pizza name")
		}
	}
}

fun main(args : Array<String>) {
	println("Ordering NY pizza...")
	val ny_pizza_store : PizzaStore = NYPizzaStore()
	val ny_cheese_pizza = ny_pizza_store.orderPizza("cheese")
	println(ny_cheese_pizza.name)

	println("Ordering LA pizza...")
	val la_pizza_store : PizzaStore = LAPizzaStore()
	val la_pepperoni_pizza = la_pizza_store.orderPizza("pepperoni")
	println(la_pepperoni_pizza.name)
}
