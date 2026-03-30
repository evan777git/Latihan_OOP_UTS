package oop_00000119455_YustinusEvanKusuma.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    // Wajib di override karena fun bekerja() bersifat abstract di Parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}