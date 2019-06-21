public class U2 extends Rocket {

    public U2() {
        // I call the Parents constructor to add a custom "weight" double since children classes of "Rocket" have difference available weights.
        super(16329.3, 120000000);
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }
}
