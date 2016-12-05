import rx.Observable
import rx.Subscriber
import rx.Subscription

class MySubscriber<T>(val name : String) :  Subscriber<T>() {

	override fun onCompleted() = println("$name: completed")
	override fun onError(e : Throwable) = println("$name completed with error $e")
	override fun onNext(v : T) = println("$name : $v")
}
	

class FactoryExample {
    fun exampleCreate() {
        var values = Observable.create<String>({ o ->
	    o.onNext("Hello")
	    o.onCompleted()
	})
	
	values.subscribe(MySubscriber("ExampleCreate"))

        //Received: Hello
	// Completed
    }

    fun rangeWithFilter() {
    	var values = Observable.range(1, 20)

	values.filter( { it % 2 == 0 } )
	      .subscribe(MySubscriber("RangeWithFilter"))

	//Produces even numbers from 1 to 20

	values.count()
	      .subscribe(MySubscriber("Count"))
	//Counts even numbers
    }

}

class Person(val name : String, val age : Int)

fun SimpleToMap() {
	var values = Observable.just(
			Person("Will", 25),
			Person("Jim", 19),
			Person("Roger", 30))
	
	values.toMap( { it.name }, { it.age } )
		.subscribe(MySubscriber("SimpleToMap"))
}

fun main(args: Array<String>) {
    var it = FactoryExample()
    it.exampleCreate()
    it.rangeWithFilter()
    SimpleToMap()
}
