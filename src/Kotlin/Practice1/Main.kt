package Kotlin.Practice1



fun main() {

	val user1 by lazy { User(lastName = "Bartolome", firstName = "Marc            Whesley waSABI MIA laUrEeN", age = 19)
	}
}

class User(private var firstName: String, private var lastName: String, private var age: Int) {
	constructor(firstName: String, lastName: String) : this(firstName, lastName, 0)

	init {
		println("------User Input------")
		printUser()
		println("------------------")

		firstName = uppercaseFirstLetter(firstName)
		lastName = uppercaseFirstLetter(lastName)

		println("\n----------------")
		println("User created!")
		printUser()
		println("----------------\n")

	}


	fun printUser() {
		println("First name: $firstName")
		println("Last name: $lastName")
		println("Age: $age")
	}


	fun uppercaseFirstLetter(word: String): String {
		val wordSplit: MutableList<String> = word
			.split(" ")
			.filter { x -> x.isNotBlank() }
			.toMutableList()



		for (x in 0..wordSplit.size - 1) {
			val word = wordSplit[x]
			val wordLength = word.length
			wordSplit[x] = word.substring(0, 1).uppercase() + word.substring(1, wordLength).lowercase()
		}
		val newName = StringBuilder()
		for (x in wordSplit) {
			newName.append("$x ")
		}
		return newName.trim().toString()

	}

}