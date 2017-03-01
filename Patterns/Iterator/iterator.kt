interface Iterator<T> {
	fun next() : T
	fun hasNext() : Boolean
}

class MyArray {
	private val array = arrayOf("First", "Second", "Third")
	
	inner class MyArrayIterator : Iterator<String> {
		private var index = 0

		override fun next() : String {
			val value = array[index]
			index++
			return value
		}

		override fun hasNext() = index < array.size 
	}

	fun getIterator() = MyArrayIterator()
}

fun main(args : Array<String>) { 
	val array = MyArray()
	val iterator = array.getIterator()

	while(iterator.hasNext())
		println(iterator.next())
}
