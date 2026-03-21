package oop_00000119455_YustinusEvanKusuma.week02

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ") // Pakai print biar input user berada di samping langsung
    val name = scanner.nextLine() // Kalau pakai scanner.next cuma membaca 1 kata (berhenti pas ketemu spasi). Kalau scanner.nextLine itu 1 kalimat (berhenti pas enter bukan spasi)

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Membersihkan sisa Enter (newline) di buffer input

    // Validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // Progam stop disini utk mahasiswa ini, gak bikin objek
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt() // Untuk angka dan berheti saat spasi
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            // Manggil primary constructor
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, ga usah daftar!")
        }
    }
}