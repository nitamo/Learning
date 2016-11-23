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

    fun rangeWithFilter() {
    	var values = Observable.range(1, 20)

	values.filter( { it % 2 == 0 } )
	      .subscribe(
	    { v -> println("Received: " + v) },
	    { e -> println("Error: " + e) },
	    { println("Completed") }
	 )

	 //Produces even numbers from 1 to 20
    }

}

fun main(args: Array<String>) {
    var it = FactoryExample()
    it.exampleCreate()
    it.rangeWithFilter()
}
