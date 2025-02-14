package model;

import interfaces.Payment;

public class CreditCard implements Payment {
    private Cash cash;
    private double creditLimit;

    public CreditCard(double initialBalance, double creditLimit) {
        this.cash = new Cash(initialBalance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void pay(double amount) {
        if (amount > creditLimit) {
            System.out.println("Pago rechazado: Excede el límite de crédito de " + creditLimit + "€");
            return;
        }

        if (amount > 1000) {
            System.out.println("Se requiere autorización adicional para montos mayores a 1000€");
        }

        cash.pay(amount);
    }

    @Override
    public double getBalance() {
        return cash.getBalance();
    }
}