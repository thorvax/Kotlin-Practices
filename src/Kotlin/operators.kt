package Kotlin

fun main() {
    val x = 4
    val y = 6

    println("x + y = ${x / y.toFloat()}")

    val isUserActive = false
    val text = if (isUserActive) "User is active" else "4"
    println(text)

    val numPow = 5e3f
    val character: Char = 66.toChar()
    println(character.code)
    println(numPow.toString())
    println(text.toInt())
}