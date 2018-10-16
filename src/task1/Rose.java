package task1;

public class Rose extends Flower {
    private int price = 100;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String print() {
        return "Rose";
    }

}
