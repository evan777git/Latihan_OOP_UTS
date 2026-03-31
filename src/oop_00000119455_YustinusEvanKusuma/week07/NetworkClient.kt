package oop_00000119455_YustinusEvanKusuma.week07

class NetworkClient(val url: String) {
// companion object adalah tempat untuk hal yang dipakai bersama oleh semua object. Contoh: kalau class = mobil. Maka companion object = buku manual mobil
    companion object {
        // const adalah nilai tetap yang tidak akan berubah
        const val BASE_URL = "https://api.umn.ac.id" // Shared constant

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}