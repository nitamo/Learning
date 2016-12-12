import java.util.concurrent.*

fun main(args : Array<String>) {
	val es = Executors.newSingleThreadExecutor()
	es.execute { println("First executor") }
	es.execute { println("Second executor") }
	es.shutdown()
}
