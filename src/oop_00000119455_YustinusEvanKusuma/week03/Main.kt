package oop_00000119455_YustinusEvanKusuma.week03

fun main () {
    val e = Employee ("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Bakal ledakin program karna setter dipanggil. Di dalam setter, baris "this.salary = value" memanggil setter lagi. Setter memanggil setter lagi. Terus menerus tanpa henti sampai memori stack habis.
}