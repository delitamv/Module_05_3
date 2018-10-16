package task1;

import java.io.*;
import java.util.Arrays;

public abstract class FlowersLoader extends FlowersSaver {
    public static Flower[] load(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line = br.readLine();
            String[] elements = line.split("[,]");
            Flower[] array = new Flower[elements.length];

            for(int i = 0; i < array.length; i++) {
                switch (elements[i]){
                    case "rose":
                        array[i] = new Rose();
                        break;
                    case "chamomile":
                        array[i] = new Chamomile();
                        break;
                    case "tulip":
                        array[i] = new Tulip();
                        break;
                    default:
                        array[i] = new Rose();
                        break;
                }
            }

            for(Flower temp : array) {
                System.out.print(temp.print() + ", ");
            }
//            System.out.println(Arrays.toString(array));

            return array;

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
