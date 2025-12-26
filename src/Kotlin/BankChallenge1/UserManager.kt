package Kotlin.BankChallenge1

class UserManager() {

	init {
		if (loadUsers()) {
			println("ALl predefined users successfully loaded!")
		} else {
			println("There was an error loading all the users")
		}
	}

	companion object {
		var users: HashMap<String, Users> = hashMapOf(Pair("Guest", Users("Guest", "0000", 50000)))
		fun isUserExist(userName: String) = users.containsKey(userName)



		fun loadUsers(): Boolean {
			users.put("Mia", Users("Mia", "0117", 5000))
			users.put("Marc", Users("Marc", "5064", 4000))
			return true
		}

		fun insertUser(userName: String, password: String, balance: Int): Boolean {
			try {
				users.put(userName, Users(userName, password, balance))
				return true
			} catch (_: Exception) {
				return false
			}
		}

		fun printUsers() {
			for (x in users) {
				print(x.value)
			}
		}

		fun printUserInfo(userName: String) {
			if (users.containsKey(userName)) {
				println(users.getValue(userName))
			}
		}

		fun createAccount(): Boolean {
			while (true) {
				print("Enter your name: ")
				val name = readln()
				if (name.isEmpty()) {
					println("Name field can't be empty")
					continue
				}
				if (isUserExist(name)) {
					println("User exist!")
				}


				print("Enter your password: ")
				val password = readln()
				if (password.isEmpty()) {
					println("Password can't be empty")
					continue
				}

				println("Enter initial balance: ")
				var balance = 0
				try {
					balance = readln().toInt()
				} catch (_: Exception) {

				}
				if (balance < 100) {
					println("Balance must be at least 100")
					continue
				}
				if (balance > 100 && !name.isEmpty() && !password.isEmpty() && !isUserExist(name)) {
					if (insertUser(name, password, balance)) {
						println("User Created")
						println(printUserInfo(name))
						return true
					} else {
						return false
					}
				}
			}
		}

		fun getUser(userName: String) = users.getValue(userName)

		fun validateAccount(userName: String): Boolean {
			while (true) {
				var user: Users
				try {
					user = users.getValue(userName)

					println("Enter password: ")
					val passowrd: String = readln()

					if (passowrd.equals(user.password)) {
						return true
					} else {
						println("Incorrect password")
						return false
					}
				} catch (_: Exception) {
					println("User doesn't exist!")
					return false
				}
			}


		}

	}
}