package com.example.kotlinbasics

fun main(args: Array<String>){
    var audiA3 = Car1("A3", "Audi")
    var teslaS = ElectricCar1("S-Model", "Tesla", 85.0)

    audiA3.drive(200.0)
    teslaS.drive(200.0)
}

// Parent Class
open class Car1(val name: String, val brand: String) {
    // open so it can be override by inheriting classes
    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        } 
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

// Child Class
class ElectricCar1(name: String, brand: String, batteryLife: Double) : Car1(name, brand) {

    var chargerType = "Type1"

    override var range = batteryLife/6  // in KM

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
}




