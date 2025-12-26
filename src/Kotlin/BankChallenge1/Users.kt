package Kotlin.BankChallenge1


class Users(val name: String, val password: String, var balance: Int) {
	override fun toString(): String {
		val message: String = buildString {
			append("\n------------------------------\n")
			append("User: $name\n")
			append("Balance: $balance\n")
			append("------------------------------\n")
		}
		return message
	}

	fun withDraw(){
		println("Enter the amount to withdraw: ")
		try {
			val amm = readln().toInt()
			if(this.balance < amm){
				println("Insufficient balance")
				return
			}
			this.balance -= amm
			println("Successfully withdrawn $amm")
			println("Your new balance is: $balance")

		}catch (_: NumberFormatException){
			println("Withdraw unsuccessful")
		}
	}
	fun deposit(){
		println("Enter the amount to deposit")
		try {
			val amm = readln().toInt()
			balance += amm
			println("$amm successfully deposited! ")
			println("Your new balance is: $balance")
		}catch (_: NumberFormatException){
			println("Withdraw unsuccessful")
		}
	}
	fun displayInfo() = println(toString())

}
