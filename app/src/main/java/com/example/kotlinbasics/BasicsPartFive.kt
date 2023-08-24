package com.example.kotlinbasics

fun main() {
    var myCar = Car()
    myCar.myMaxSpeed = 200
    println("car speed is ${myCar.maxSpeed}")

    // Testing
    val iphone = MobilePhones("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhones("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhones("Android", "Huawei", "Mate X S")

    iphone.chargeBattery(20)
}

class Car() {

    lateinit var owner : String

    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.lowercase()
        }

    var maxSpeed: Int = 250

    // default setter and getter
    var myModel: String = "M5"
        private set

    var myMaxSpeed: Int = maxSpeed
        get() = field
        // Custom Setter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("_maxSpeed must be greater than zero")
        }

    init{
        this.myModel = "M3"
        this.owner = "Frank"
    }
}

/// Example
class MobilePhones(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}