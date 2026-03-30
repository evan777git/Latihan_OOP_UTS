package oop_00000119455_YustinusEvanKusuma.week04

open class Car (brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk () {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik parent
        // super manggil orang tua (parent) dan this manggil diri sendiri (this.accelerate())
        println("Mobil $brand menggunakan transmisi gigi untuk menambahkan kecepatan.")
    }
}