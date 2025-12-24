package Kotlin


fun main() {

    print(sum(1,2,3,4,5,6,7,8,9,10))
}

fun sum(vararg number: Int): Int{
    var sumNum = 0
    for (x in number) {
        sumNum += x
    }
    return  sumNum
}