package oop_00000119455_YustinusEvanKusuma.week07

// enum class adalah daftar pilihan yang sudah ditentukan dan terbatas (gak mungkin ada yang lain)
enum class AppState {
    STARTING, RUNNING, STOPPED
}

// sealed class adalah kelompok kemungkinan yang sudah ditentukan
sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Failure(val message: String) : ApiResponse()
    object Loading : ApiResponse()
} // ApiResponse cuma bisa jadi 3 hal: Success -> ada data, Failure -> ada pesan error, Loading -> sedang proses