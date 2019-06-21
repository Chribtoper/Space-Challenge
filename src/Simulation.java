import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    Simulation() throws FileNotFoundException {
        try {
            int num = 1;
            File file = new File("phase-" +num+ ".txt");
            Scanner scanner = new Scanner(file);
        } catch(FileNotFoundException exception) {
            System.out.println(exception);
        }
    }

    public ArrayList<Item> loadItems() {

    }
}
