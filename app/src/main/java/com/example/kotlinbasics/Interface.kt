package com.example.kotlinbasics

fun main(args: Array<String>){
    var audiA3 = Cars(200.0, "Audi")
    var teslaS = ElectricCar(250.0, "Tesla", 85.0)

    // Polymorphism is the ability to treat objects
    // with similar traits in a common way
    audiA3.drive()

    // Only works because ElectricCar is a Subclass of Car
    // Or alternatively works if Car was an Interface and ElectricCar would inherit from it
    teslaS.drive()
    teslaS.drive(200.0)
}

interface Driveable {
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Class Car which extends the interface
open class Cars(override val maxSpeed: Double, open val brandName: String) : Driveable {

    // open so it can be override by inheriting classes
    open var range: Double = 0.0

    open fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

//    override  fun drive(): String = "Drove for $range KM"
    override fun drive(): String {
        println("Drove for $range KM")
        return range.toString()
    }

    // overridden functions are implicitly open:
    override fun brake() {
        println("The car is breaking")
    }
}
// In case there is no primary Constructor
class ElectricCar(override val maxSpeed: Double,
                  override val brandName: String,
                  batteryLife: Double) : Cars(maxSpeed, brandName) {

    // in KM
    override var range = batteryLife/6

    override fun drive() = "Overriding the drive of my Car"

    fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
    override fun brake(){
        println("The electirc car is breaking")
    }
}