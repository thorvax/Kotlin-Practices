package Kotlin

fun main() {

	print("Enter the first number: ")
	var firsNum: Int = Integer.parseInt(readLine())

    print("Enter the last number: ")
	val lastNum: Int = Integer.parseInt(readLine())
    var evenNumCount = 0

    while (firsNum <= lastNum){
        if(firsNum %2 == 0 && firsNum > 0){
            print("$firsNum ")
            evenNumCount++
        }
        firsNum++
    }
    println("\nTotal count of even numbers: $evenNumCount")
}

