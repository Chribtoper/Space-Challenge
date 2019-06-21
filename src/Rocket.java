public class Rocket implements SpaceShip {

    private double weight;

    public Rocket(double weight) {
        this.weight = weight;
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public final boolean canCarry(Item item) {
        return true;
    }

    public final void carry(Item item) {

    }
}
