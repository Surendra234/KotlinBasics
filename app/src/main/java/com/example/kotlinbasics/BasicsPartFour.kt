package com.example.kotlinbasics

fun main() {

    val personOne = Person("Gaurav","Mahawar", 21)
    personOne.hobby = "Play video game"
    personOne.stateHobby()

    // Secondary constructor called
    val personTwo = Person("Surendra", "Mahawar", 24)
    personTwo.hobby = "Watching Netflix"
    personTwo.stateHobby()
}

// Primary constructor (Parameter inside the class)
class  Person(firstName: String, lastName: String) {

    // Member Properties
    var age: Int? = null
    var firstName: String? = null
    var hobby: String = "Swimming"

    // Initializer
    init {
        println("Init called person $firstName $lastName")
    }

    // Secondary member constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
        this.firstName = firstName
        println("Secondary Init called person $firstName $lastName and i am $age year old")
    }

    // Member Function
    fun stateHobby() {
        println("$firstName hobby is $hobby")
    }
}