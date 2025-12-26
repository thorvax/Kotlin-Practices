package Kotlin.BankChallenge1

fun main() {
	val userManager = UserManager()
	while (true) {
		println("[1]Create Account")
		println("[2]Log In")
		println("[3]Print Accounts")
		println("[4]Exit")
		var choice = 0
		try {
			choice = readln().toInt()
		}catch (_: Exception){
			println("Invalid input: $choice")
		}
		when (choice) {
			1 -> UserManager.createAccount()
			2 -> {
				print("Enter account name: ")
				val userName = readln()
				if (UserManager.validateAccount(userName)) {
					val user = UserManager.getUser(userName)
					while (true) {
						println("[1]Withdraw")
						println("[2]Deposit")
						println("[3]Display Balance")
						println("[4]Exit")
						var choice: Byte
						try {
							choice = readln().toByte()
							when (choice.toInt()) {
								1 -> {user.withDraw()}
								2 -> {user.deposit()}
								3 -> {user.displayInfo()}
								4 -> {return}
								else -> println("Invalid Input: $choice")
							}
						} catch (_: Exception) {

						}
					}
				}
			}
			3 -> UserManager.printUsers()
			4 -> return
			else -> println("Invalid input: $choice")
		}
	}


}
