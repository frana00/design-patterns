package staff;

import commands.Command;
import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orders;

    public Waiter() {
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Command command) {
        orders.add(command);
    }

    public void executeOrders() {
        for(Command command : orders) {
            command.execute();
        }
        orders.clear();
    }
}