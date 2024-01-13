package com.example.abstractinterface.assignment

import com.example.abstractinterface.assignment.AbstractAccount

class SavingsAccount(balance: Double) : AbstractAccount(balance) {
    override fun accountType(): String {
        return "Savings Account"
    }
}

class CheckingAccount(balance: Double) : AbstractAccount(balance) {
    override fun accountType(): String {
        return "Checking Account"
    }
}
