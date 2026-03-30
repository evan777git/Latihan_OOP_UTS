package oop_00000119455_YustinusEvanKusuma.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable{
    override fun turnOn() {
        println("Lampus $name dinyalakan.")
    }

    override fun turnOff() {
        println("Lampu $name dimatikan.")
    }
}