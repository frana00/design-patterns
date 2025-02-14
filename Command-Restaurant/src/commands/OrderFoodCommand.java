package commands;

import restaurant.Chef;

public class OrderFoodCommand implements Command {
    private Chef chef;
    private String dish;

    public OrderFoodCommand(Chef chef, String dish) {
        this.chef = chef;
        this.dish = dish;
    }

    @Override
    public void execute() {
        chef.prepareFood(dish);
    }
}