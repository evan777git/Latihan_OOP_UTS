package oop_00000119455_YustinusEvanKusuma.week04

// Pake keyword "open" agar class bisa diwariskan
// Di wariskan maksudnya agar class lain bisa ngambil properti dan method dari class ini (jadi otomatis class yang ambil punya speed, accelerate(), honk())
open class Vehicle(val brand: String) {
    var speed: Int = 0

    // Method juga bersifat final secara default. Gunakan "open" adar bisa di override
    // Di override maksudnya bisa ubah properti dan methoc yang di wariskan di dalam class sendiri. Contohnya:
    // override funk honk () {
    //      println("Tiiin tiiin!")
    // }
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep beep!")
    }
}