package com.example.abstractinterface.assignment

abstract class AbstractAccount(private var balance: Double) : BankAccount {
    override fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    override fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        }
    }

    override fun getBalance(): Double {
        return balance
    }

    abstract fun accountType(): String
}
