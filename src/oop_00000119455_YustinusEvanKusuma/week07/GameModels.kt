package oop_00000119455_YustinusEvanKusuma.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(30),
    RARE(7),
    EPIC(2),
    LEGENDARY(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)