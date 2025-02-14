package commands;

import restaurant.Table;

public class PrepareTableCommand implements Command {
    private Table table;

    public PrepareTableCommand(Table table) {
        this.table = table;
    }

    @Override
    public void execute() {
        table.prepare();
    }
}