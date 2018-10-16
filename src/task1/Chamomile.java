package task1;

public class Chamomile extends Flower {
    private int price = 70;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String print() {
        return "Chamomile";
    }
}
