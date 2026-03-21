package oop_00000119455_YustinusEvanKusuma.week02

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ") // Pakai print biar input user berada di samping langsung
    val name = scanner.next()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Membersihkan sisa Enter (newline) di buffer input

    // Validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // Progam stop disini utk mahasiswa ini, gak bikin objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Instansiasi Objek karena data udh aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}