package oop_00000119455_YustinusEvanKusuma.week02

class Student (
    val name: String,
    val nim: String,
    val major: String
){ // init berfungsi untuk cek apakah data sudah valid atau belum
    init {
        // Validasi Sederhana: Cek panjang NIM
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}