import java.util.*
import java.util.concurrent.*

class WeighAnimalAction(val start : Int, val end : Int, val weights : DoubleArray) : RecursiveAction() {
	override fun compute() {
		println("[new computing thread]")

		if(end - start <= 3)
			for(i in start..end) {
				weights[i] =  Random().nextInt(100).toDouble()
				println("Animal weighed: ${i}")
			}
		else {
			val middle = start + ((end - start) / 2)
			println("[start=${start},middle=${middle},end=${end}]")
			invokeAll( WeighAnimalAction(start, middle, weights), WeighAnimalAction(middle, end, weights))
		}
	}
}

fun main(args : Array<String>) {
	val weights = DoubleArray(10) 

	val task = WeighAnimalAction(0, weights.size - 1, weights)
	val pool = ForkJoinPool()

	pool.invoke(task)

	println()
	println("Weights: ")
	weights.forEach { print("${it} ") }
}

