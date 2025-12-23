package Kotlin

import Java.JavaCar


fun main() {

    val array = arrayOf(
        arrayOf("Marc", "Whesley", "Bartolome"),
        arrayOf("Mia", "Laureen", "Quinagon")
    )
    printArrayString(
        array
    )

    val c1 = Car("GTR123", "Nissan", 2018)
    c1.runCar()

    val c2Java = JavaCar()

    c2Java.printArrayString(array)
}



fun printArrayString(strArr: Array<Array<String>>) {
    for (row in strArr) {
        for (value in row) {
            print(value)
        }
        println("\n-----\n")
    }
}

