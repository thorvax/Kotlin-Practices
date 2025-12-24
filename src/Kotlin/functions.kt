package Kotlin

import Java.JavaCar

fun main() {
	val array = arrayOf(
		arrayOf("Marc", "Whesley", "Bartolome"), arrayOf("Mia", "Laureen", "Quinagon")
	)
	printArrayString(
		array
	)


	val c1 = Car("GTR123", "Nissan", 2018)
	c1.runCar()

	val c2Java = JavaCar()

	c2Java.printArrayString(array)

	val numbers = arrayOf(
		1, 2, 3, 4, 5, 6, 8, 19,90,1000,203
	)

	print("Max Value in var numbers is: ${findMax(numbers)}")
}


fun printArrayString(strArr: Array<Array<String>>) {
	for (row in strArr) {
		for (value in row) {
			print(value)
		}
		println("\n-----\n")
	}
}

fun findMax(arr: Array<Int>): Int {
	return arr.max()
}

