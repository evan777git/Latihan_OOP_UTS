package oop_00000119455_YustinusEvanKusuma.week03

fun main () {
    val e = Employee ("Budi")

    // 1. Test validasi salary
    e.salary = -1_000 // Harusnya print error
    e.salary = 5_000_000
    println("Gaji: ${e.salary}")

    // 2. Test encapsulation (Menyembunyikan data + hanya memberi akses lewat fungsi. Contoh: performanceRating disembunyikan pakai private)
    e.increasePerformance()

    // 3. Test computed property (Property yang nilainya tidak disimpan, tapi dihitung saat dipanggil)
    println("Pajak yang harus dibayar ${e.tax}")
}