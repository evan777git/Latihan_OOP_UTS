package oop_00000119455_YustinusEvanKusuma.week06

class Button(override val name: String) : Clickable{
    override fun click() {
        println("Tombol $name berhasil diklik!")
    }
}