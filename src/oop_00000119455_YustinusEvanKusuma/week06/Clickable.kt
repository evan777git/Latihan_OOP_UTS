package oop_00000119455_YustinusEvanKusuma.week06

// Interface itu seperti aturan: “Semua tombol harus bisa diklik” -> Tapi cara kliknya bisa beda-beda
interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Impliciyly Abstract)
    fun click()
}