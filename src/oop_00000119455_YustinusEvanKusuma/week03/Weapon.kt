package oop_00000119455_YustinusEvanKusuma.week03

class Weapon(
    val name: String,
    damage: Int
) {
    var damage: Int = damage

        set(value) {
            if(value < 0) {
                println("Damage tidak boleh negatif. Otomatis ubah ke 0.")
                return
            } else if(value > 1000) {
                println("Terlalu overpower! Otomatis ubah ke 1000.")
                field = 1000
                return
            } else {
                field = value
            }
        }

    val tier: String
        get() = when{
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}