import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    // public ArrayList<Item>
    public void loadItems() {
        try {
            int num = 1;
            File file = new File("phase-" +num+ ".txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());

            }
        } catch(FileNotFoundException exception) {
            System.out.println(exception);
        }
    }
}
