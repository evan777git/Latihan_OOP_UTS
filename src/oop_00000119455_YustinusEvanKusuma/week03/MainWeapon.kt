package oop_00000119455_YustinusEvanKusuma.week03

fun main() {
    val weapon = Weapon ("Qris", 100)

    weapon.damage = -50

    weapon.damage = 9999

    println("Nama Weapon: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}