package oop_00000119455_YustinusEvanKusuma.week06

class SmartCCTV (override val id: String, override val name: String) : SmartDevice, Switchable, Recordable{
    override fun startRecord() {
        println("CCTV $name mulai merekam.")
    }

    override fun turnOn() {
        println("CCTV $name dinyalan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name dimatikan.")
        stopRecord()
    }
}