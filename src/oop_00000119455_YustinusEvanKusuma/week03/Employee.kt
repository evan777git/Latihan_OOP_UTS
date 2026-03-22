package oop_00000119455_YustinusEvanKusuma.week03

class Employee (val name: String) {
    var salary: Int = 0
        set(value) {
            if(value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0 // Pake field, jangan this.salary
            } else {
                field = value // Pake field untuk assign nilai asli
            }
        }

    val tax: Double
        get() = salary * 0.1

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}