package Kotlin

fun main(){
    val array = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9)
    )
    for(x in array){
        print("Memory: $x \nSize: ${x.size} \nValue: ")
        for(value in x){
            print(value)
        }
        print("\n-------\n")
    }

}