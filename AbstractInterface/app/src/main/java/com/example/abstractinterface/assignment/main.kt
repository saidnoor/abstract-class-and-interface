package com.example.abstractinterface.assignment

fun main() {
    val savings = SavingsAccount(10000.0)
    val checking = CheckingAccount(0.0)

    savings.deposit(10000.0)
    checking.deposit(10000.0)

    savings.withdraw(2000.0) // Withdraw via ATM
    checking.withdraw(2000.0) // Withdraw via Teller

    println("${savings.accountType()} balance: ${savings.getBalance()}")
    println("${checking.accountType()} balance: ${checking.getBalance()}")

    // Stock Brokerage Operations
    val stockBroker = StockBroker()
    stockBroker.buyStock("KCB", 100) 
    stockBroker.buyStock("BAT", 400)
}
