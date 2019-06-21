public class Rocket implements SpaceShip {

    private int cost;
    private int weight;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return true;
    }

    public void carry(Item item) {

    }
}
