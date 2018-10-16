package task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FlowersSaver {
    public static void save(String fileName, Flower[] flowers) {

        try {
            FileWriter writer = new FileWriter(fileName, true);
            for(Flower temp : flowers) {
                writer.write(temp.print() + ", ");
            }
            writer.append('\n');
            writer.close();
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());;
        }
    }
}
