package oop_00000119455_YustinusEvanKusuma.week01

fun main () {
    val gameTitle = "Game apalah"
    val price = 250_000

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

// Tipe data harus konsisten. Operasi price * 0.8 menghasilkan Double karena melibatkan bilangan desimal, sedangkan fungsi diharapkan mengembalikan Int. Oleh karena itu, digunakan .toInt()
fun calculateDiscount(price: Int) = if(price > 500_000)
        (price * 0.8).toInt() else (price * 0.9).toInt()

fun printReceipt(
    title: String,
    finalPrice: Int
) {
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
}