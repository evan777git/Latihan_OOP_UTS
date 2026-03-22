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
}