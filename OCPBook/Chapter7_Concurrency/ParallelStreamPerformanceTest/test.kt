import kotlinx.support.jdk8.collections.*

fun increase(num : Int) : Int {
	Thread.sleep(10)
	return num + 1
}

fun performOrdinary(list : List<Int>) =	list.stream().map(::increase).count()

fun performParallel(list : List<Int>) = list.parallelStream().map(::increase).count()

fun main(args : Array<String>) {
	val list = (1..4000).toList()

	var start = System.currentTimeMillis()
	performOrdinary(list)
	println("Elapsed time is: ${
		(System.currentTimeMillis() - start)/1000.0
	}")

	start = System.currentTimeMillis()
	performParallel(list)
	println("Elapsed time is: ${
		(System.currentTimeMillis() - start)/1000.0
	}")
}
