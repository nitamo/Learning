import rx.Observable

class FactoryExample {
    fun exampleCreate() {
        var values = Observable.create<String>({ o ->
	    o.onNext("Hello")
	    o.onCompleted()
	})
	
	values.subscribe(
	    { v -> println("Received: " + v) },
 	    { e -> println("Error: " + e) },
  	    { println("Completed") }
        )

        //Received: Hello
	// Completed
    }
}

fun main(args: Array<String>) {
    var it = FactoryExample()
    it.exampleCreate()
}
