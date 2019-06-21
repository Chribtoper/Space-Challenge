import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    public void loadU1() {

        ArrayList<Item> items = this.loadItems(1);
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new U1();

        for(int i = 0; i < items.size(); i++) {

            Item item = items.get(i);
            System.out.println(item.getName());
            System.out.println(item.getWeight());

        }
    }

//    public ArrayList loadU2() {
//
//    }

    private ArrayList loadItems(int num) {

        ArrayList<Item> itemList = new ArrayList<>();

        try {
            File file = new File("phase-" +num+ ".txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line[] = scanner.nextLine().split("=");
                Item item = new Item(line[0], Integer.parseInt(line[1]));
                itemList.add(item);
            }
        } catch (FileNotFoundException f) {
            System.out.println(f);
            System.out.println("File not found. Make sure you have files named like 'phase-1.txt', 'phase-2.txt'... etc");
            System.out.println("Simulation.loadItems(int num) takes an integer as a param which will determine which phase file to input.");
        }
        return itemList;
    }
}
