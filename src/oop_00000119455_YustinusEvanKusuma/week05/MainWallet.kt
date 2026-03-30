package oop_00000119455_YustinusEvanKusuma.week05

fun main() {
    val wallet = EWallet("Evan", 50_000.0)
    val creditCard = CreditCard("Evan777", 100_000.0)

    val payments: List<PaymentMethod> = listOf(wallet, creditCard)

    for(payment in payments) {
        payment.processPayment(75_000.0)
    }
}