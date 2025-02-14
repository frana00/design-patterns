package restaurant;

public class Table {
    private int number;

    public Table(int number) {
        this.number = number;
    }

    public void prepare() {
        System.out.println("Mesa " + number + " preparada con cubiertos y servilletas");
    }
}