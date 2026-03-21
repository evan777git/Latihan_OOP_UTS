package oop_00000119455_YustinusEvanKusuma.week02

class Hero (
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {
    fun attack(targetName: String) {
        println("$name menyerang $targetName dengan damage $baseDamage!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0
        }
        println("$name menerima $damage. Sisa HP: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}