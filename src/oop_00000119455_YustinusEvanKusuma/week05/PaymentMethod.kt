package oop_00000119455_YustinusEvanKusuma.week05

abstract class PaymentMethod(val accountName: String) {
    abstract  fun processPayment(amount: Double)
}