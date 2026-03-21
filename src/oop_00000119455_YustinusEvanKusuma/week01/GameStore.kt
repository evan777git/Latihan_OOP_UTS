package oop_00000119455_YustinusEvanKusuma.week01

fun main () {
    val gameTitle = "Game apalah"
    val price = 250_000
    val note: String? = null // Isi kalau ada catatan

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = note)
}

// Tipe data harus konsisten. Operasi price * 0.8 menghasilkan Double karena melibatkan bilangan desimal, sedangkan fungsi diharapkan mengembalikan Int. Oleh karena itu, digunakan .toInt()
fun calculateDiscount(price: Int) = if(price > 500_000)
        (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(
    title: String,
    finalPrice: Int,
    note: String?
) {
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")

    println("Catatan: ${note?: "Tidak ada catatan"}")
}