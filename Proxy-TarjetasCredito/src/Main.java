import interfaces.Payment;
import model.Cash;
import model.CreditCard;

public class Main {
    public static void main(String[] args) {
        // Crear una tarjeta de crédito con 1000€ de saldo y 500€ de límite
        Payment creditCard = new CreditCard(1000.0, 500.0);

        System.out.println("=== Prueba de pagos con tarjeta ===");
        creditCard.pay(200.0);  // Pago válido
        creditCard.pay(600.0);  // Excede el límite de crédito
        creditCard.pay(1500.0); // Requiere autorización adicional

        System.out.println("\n=== Prueba de pagos en efectivo ===");
        Payment cash = new Cash(1000.0);
        cash.pay(500.0);  // Pago válido
        cash.pay(600.0);  // Saldo insuficiente
    }
}