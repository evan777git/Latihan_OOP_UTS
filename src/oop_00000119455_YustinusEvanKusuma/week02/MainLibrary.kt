package oop_00000119455_YustinusEvanKusuma.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("\n--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Peminjaman (Hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        println("Durasi tidak boleh minus. Otomatis diubah menjadi 1 hari")
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)

    val fine = loan.calculateFine()

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: RP. $fine")
}