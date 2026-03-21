package oop_00000119455_YustinusEvanKusuma.week01

fun main () {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    checkSize(area)

    println(checkSize(area))
}

// Kotlin Tidak bisa menebak tipe parameter function, karena function bisa dipanggil dari mana aja (harus jelas tipenya)
fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle" else "This is a Small Circle"