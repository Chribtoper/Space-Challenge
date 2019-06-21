public class U1 extends Rocket {

    public U1() {
        // I call the Parents constructor to add a custom "weight" double since children classes of "Rocket" have difference available weights.
        super(9071.85);
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }
}
