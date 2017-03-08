fun <T> joinToString(c : Collection<T>, p : String = "", i : String = ",", s : String = "") : String {
	val sb = StringBuilder(p)

	for((index, value) in c.withIndex()) {
		if (index > 0)
			sb.append(i)
		sb.append(value)
	}
	sb.append(s)
	return sb.toString()
}

fun main(args : Array<String>) {
	val data = listOf(1, 2, 3)
	println(joinToString(data))		
	println(joinToString(data, p = "[", s = "]"))		
	println(joinToString(data, "(", ";", ")"))		
}
	
