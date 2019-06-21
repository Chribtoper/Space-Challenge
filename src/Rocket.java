public class Rocket implements SpaceShip {

    private double maxWeight;
    private double weightCarried;
    private int price;

    public Rocket(double maxWeight, int price) {
        this.maxWeight = maxWeight;
        this.price = price;
    }

    public long getPrice() {
        return this.price;
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public final boolean canCarry(Item item) {
        if (this.weightCarried + (double) item.getWeight() < maxWeight) {
            return true;
        } else {
            return false;
        }
    }

    public final void carry(Item item) {
        this.weightCarried += (double) item.getWeight();
    }
}
