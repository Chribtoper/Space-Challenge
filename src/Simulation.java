import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    // public ArrayList<Item>
    public ArrayList loadItems() {

        ArrayList<Item> itemList = new ArrayList<Item>();

        try {
            int num = 1;
            File file = new File("phase-" +num+ ".txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line[] = scanner.nextLine().split("=");
                Item item = new Item(line[0], Integer.parseInt(line[1]));
                itemList.add(item);
            }
        } catch (FileNotFoundException f) {
            System.out.println(f);
            System.out.println("File not found.");
        }
        return itemList;
    }
}
