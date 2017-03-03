interface Composer {
	fun print()
}

class Leaf(val name : String) : Composer {
	override fun print() = println("Leaf name : $name")
}

class Node(val nodes : Array<Composer>) : Composer {
	override fun print() {
		for (node in nodes)
			node.print()
	}
}

fun main(args : Array<String>) {
	val leaf1 = Leaf("Level1, Leaf1")
	val leaf2 = Leaf("Level1, Leaf2")
	val leaf3 = Leaf("Level2, Leaf1")
	val leaf4 = Leaf("Level2, Leaf2")
	val leaf5 = Leaf("Level3, Leaf1")
	val leaf6 = Leaf("Level3, Leaf2")

	val node3 = Node(arrayOf(leaf5, leaf6))
	val node2 = Node(arrayOf(leaf3, leaf4, node3))
	val node1 = Node(arrayOf(leaf1, leaf2, node2))

	node1.print()
}
