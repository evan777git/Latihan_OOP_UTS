package oop_00000119455_YustinusEvanKusuma.week07

// DatabaseManager adalah singleton (Cuma ada satu saja. Contoh: Presiden dalam 1 negara -> cuma 1) object -> hanya ada 1 instance (benda asli yang dibuat dari sebuah class) saja di seluruh program
// Jadi fungsi object agar cuma ada 1 DatabaseManager (semmua orang pakai yang sama) tidak ada val db1 = DatabaseManager() val db2 blablaa
object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}