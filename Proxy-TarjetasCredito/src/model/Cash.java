package model;

import interfaces.Payment;

public class Cash implements Payment {
    private double balance;

    public Cash(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Pagado " + amount + "€ en efectivo");
            System.out.println("Saldo restante: " + balance + "€");
        } else {
            System.out.println("Saldo insuficiente en efectivo");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}