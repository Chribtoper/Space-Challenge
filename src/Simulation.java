import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

    public long runSimulation(ArrayList<Rocket> rockets) {

        long budget = 0;

        for(Rocket rocket: rockets) {
            long cost = rocket.getPrice();

            do {
                budget += cost;
                if ((rocket.launch() && rocket.land())) break;
            } while (true);
        }
        return budget;
    }

    public ArrayList loadU1(int num) {

        ArrayList<Item> items = this.loadItems(num);
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new U1();

        for(Item item: items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new U1();
            }
        }
        return rockets;
    }

    public ArrayList loadU2(int num) {

        ArrayList<Item> items = this.loadItems(num);
        ArrayList<Rocket> rockets = new ArrayList<>();
        Rocket rocket = new U2();

        for(Item item: items) {
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new U2();
            }
        }
        return rockets;
    }

    // Takes in an integer "num" which represents which phase.txt file to import.
    // Example, inputting 1 would import "phase-1.txt".
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
