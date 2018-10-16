package task1;

public class Tulip extends Flower {
    private int price = 45;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String print() {
        return "Tulip";
    }
}
