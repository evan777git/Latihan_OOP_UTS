package oop_00000119455_YustinusEvanKusuma.week06

// Interface itu seperti aturan: “Semua tombol harus bisa diklik” -> Tapi cara kliknya bisa beda-beda
interface Clickable {
    val name: String // Abstract property, tidak ada nilai default

    // Function without body (Impliciyly Abstract)
    fun click()
}