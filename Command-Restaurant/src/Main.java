import commands.*;
import restaurant.*;
import staff.Waiter;

public class Main {
    public static void main(String[] args) {
        // Crear los "receptores"
        Chef chef = new Chef();
        Table table = new Table(1);

        // Crear los comandos
        Command prepareTable = new PrepareTableCommand(table);
        Command orderPasta = new OrderFoodCommand(chef, "Pasta Carbonara");
        Command orderSteak = new OrderFoodCommand(chef, "Filete a la parrilla");

        // Crear el camarero (invocador)
        Waiter waiter = new Waiter();

        // El camarero toma las órdenes
        System.out.println("=== Cliente llega al restaurante ===");
        waiter.takeOrder(prepareTable);
        waiter.takeOrder(orderPasta);
        waiter.takeOrder(orderSteak);

        // El camarero ejecuta todas las órdenes
        System.out.println("\n=== Camarero ejecuta las órdenes ===");
        waiter.executeOrders();
    }
}