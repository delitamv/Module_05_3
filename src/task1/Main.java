package task1;

import static task1.FlowersLoader.load;
import static task1.FlowersSaver.save;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Rose();

        Flower chamomile = new Chamomile();

        Flower tulip = new Tulip();
//        Flower[] f = {rose, chamomile, tulip};
//        for(Flower temp : f) {
//
//            System.out.println(temp.print());
//        }


        FlowerStore flowerStore = new FlowerStore();

        Flower[] flowers = flowerStore.sell(5, 3, 1);
        System.out.print("Method sell:  ");
        for(Flower temp : flowers) {
            System.out.print(temp.print() + ", ");
        }
        System.out.println();
        System.out.println("Cash in the shop: " + flowerStore.getCash());
        System.out.println();
        save("Flowers_file.txt", flowers);

        System.out.println();

        Flower[] flowers1 = flowerStore.sellSequence(6, 3, 1);
        System.out.print("Method sell sequence:  ");
        for(Flower temp1 : flowers1) {
            System.out.print(temp1.print() + ", ");
        }
        System.out.println();
        System.out.println("Cash in the shop: " + flowerStore.getCash());

        System.out.println();
        save("Flowers_file.txt", flowers1);

        System.out.println();
        System.out.println("Reading flowers from the file: ");
        load("Flowers_file.txt");


    }

}
