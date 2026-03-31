package oop_00000119455_YustinusEvanKusuma.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status : ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory -> Kita tidak bikin object secara langsung, tapi lewat fungsi pembuat
    client.connect()
}