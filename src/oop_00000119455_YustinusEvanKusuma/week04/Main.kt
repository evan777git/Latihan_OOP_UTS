package oop_00000119455_YustinusEvanKusuma.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk() // Memanggil method yang sudah di override
    myCar.accelerate() // Memanggil gabungan method Parent dan Child

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Tesla", 2, 200)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}