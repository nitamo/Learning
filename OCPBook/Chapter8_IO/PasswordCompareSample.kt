import java.io.*
import java.util.*

fun main(args : Array<String>) {
	val console = System.console()
	if(console == null) throw RuntimeException("Console is not available")

	val password = console.readPassword("Enter your password: ")
	console.printf("Enter your password again: ")
	console.flush()
	val verify = console.readPassword()
	val match = Arrays.equals(password, verify)

	for (i in password.indices) { 
		password[i] = 'x'
	}

	for (i in verify.indices) { 
		verify[i] = 'x'
	}

	console.printf("Your password was ${ if (match) "correct" else "incorrect" }")
}
