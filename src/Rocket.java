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
        if (this.weight - (double) item.getWeight() > 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public final void carry(Item item) {
        this.weight -= (double) item.getWeight();
    }
}
