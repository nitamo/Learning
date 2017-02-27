import java.util.concurrent.*

val scheduler = Executors.newScheduledThreadPool(1)

fun beepForMe() {
	val beeperHandle = scheduler.scheduleAtFixedRate( { println("beep") }, 10, 10, TimeUnit.SECONDS)
	scheduler.schedule( { beeperHandle.cancel(true) }, 60, TimeUnit.SECONDS)
}

fun main(args : Array<String>) {
	beepForMe()
}
