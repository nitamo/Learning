import javax.swing.*

class Flow : JPanel() {
	init {
		add(JButton("First"))
		add(JButton("Second"))
		add(JButton("Third"))
		add(JButton("Fourth"))
		add(JButton("Last"))
	}
}

fun main(args : Array<String>) {
	val frame = JFrame("FlowLayoutTest")
	frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE)
	frame.setSize(400, 75)
	frame.setLocation(200, 200)

	val flow = Flow()
	frame.setContentPane(flow)
	frame.setVisible(true)
}
