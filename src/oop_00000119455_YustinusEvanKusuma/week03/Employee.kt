package oop_00000119455_YustinusEvanKusuma.week03

class Employee (val name: String) {
    var salary: Int = 0
    println("Mencoba set gaji ke: $value")
    // Kode dibawah salah & bahaya, karna coba manggil setter dalam setter (Recursive)
    this.salary = value
}