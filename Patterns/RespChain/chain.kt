interface Node {
	val nextNode : Node?
	fun printInfo(str: String)
	fun endIsReached(str : String) = println("Unknown type of $str. No more possibilities")
}

class Alpha(override val nextNode: Node?) : Node {
	override fun printInfo(str: String) {
		if(str[0].isLetter())
			println("Char ${str}  is alpha")
		else	
			nextNode?.printInfo(str) ?: endIsReached(str)
	}
}

class Num(override val nextNode: Node?) : Node {
	override fun printInfo(str: String) {
		if(str[0].isDigit())
			println("Char ${str}  is number")
		else	
			nextNode?.printInfo(str) ?: endIsReached(str)
	}
}

class Whitespace(override val nextNode: Node?) : Node {
	override fun printInfo(str: String) {
		if(str[0].isWhitespace())
			println("Char ${str}  is whitespace")
		else	
			nextNode?.printInfo(str) ?: endIsReached(str)
	}
}

fun main(args : Array<String>) {
	val white = Whitespace(null)
	val digit = Num(white)
	val alpha = Alpha(digit)

	val seq = listOf("A", "9", " ", ";")
	seq.forEach { alpha.printInfo(it) }
}
