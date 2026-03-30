package oop_00000119455_YustinusEvanKusuma.week04

fun main() {
    println("--- Manager ---")
    val Manager1 = Manager("Evan", 50_000_000)
    Manager1.work()
    println("Manager ${Manager1.name} mendapatkan bonus sebesar ${Manager1.calculateBonus()}.")

    println("\n--- Developer ---")
    val Developer1 = Developer("Chris", 500_000, "Python")
    Developer1.work()
    println("Developer ${Developer1.name} mendapatkan bonus sebesar ${Developer1.calculateBonus()}.")
}