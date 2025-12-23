package Kotlin

class Car {
    private var carName: String = ""
    private var model: String = ""
    private var year: Short = 0

    constructor(carName: String, model: String, year: Short) {
        this.carName = carName
        this.model = model
        this.year = year
    }

    fun runCar() {
        println("$model $carName $year is running!")
        print("Broom Broom!\n")
    }
}