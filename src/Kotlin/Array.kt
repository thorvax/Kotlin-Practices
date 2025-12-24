package Kotlin

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val array = arrayOf(
        arrayOf(1, 2, 3, 0),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    printArr(array)
    changeValue(array, sc)
    printArr(array)
}

fun printArr(arr: Array<Array<Int>>) {

    for (x in arr) {
        print("Memory: $x \nSize: ${x.size} \nValue: ")
        for (value in x) {
            print(value)
        }
        print("\n-------\n")
    }

}

fun changeValue(array: Array<Array<Int>>, sc: Scanner): Array<Array<Int>>{

    for (x in 0..array.size - 1) {
        print("x = $x")
        for (a in 0..array[x].size-1) {
            print("a = $a")

            println("Change value for index row $x index $a")
            print("${array[x][a]} -> ")

            val value: Int = sc.nextInt()
            array[x][a] = value
        }
        println()
    }
    return array
}