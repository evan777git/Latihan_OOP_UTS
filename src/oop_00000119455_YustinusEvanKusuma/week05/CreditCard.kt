package oop_00000119455_YustinusEvanKusuma.week05

class CreditCard (accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran selesai. Total saldo terpakai: Rp $usedAmount")
        } else {
            println("Pembayaran ditolak. Kartu melebihi limit.")
        }
    }
}