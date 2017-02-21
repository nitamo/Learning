import java.awt.*
import java.awt.event.*
import javax.swing.*

class Card : JPanel() {
	val cards = CardLayout()

	init {
		setLayout(cards)

		val listener : (event : ActionEvent) -> Unit  = { cards.next(this) }

		val button1 = JButton("First")
		button1.addActionListener( listener )
		add(button1, "First")
		
		val button2 = JButton("Second")
		button2.addActionListener( listener )
		add(button2, "Second")
		
		val button3 = JButton("Third")
		button3.addActionListener( listener )
		add(button3, "Third")
	}
}

fun main(args : Array<String>) {
	val frame = JFrame("CardLayoutTest")
	frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE)
	frame.setSize(200, 200)
	frame.setLocation(200, 200)

	frame.setContentPane(Card())
	frame.setVisible(true)
}
