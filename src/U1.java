public class U1 extends Rocket {

    public U1() {
        // I call the Parents constructor to add a custom "weight" and "price" since children classes of "Rocket" have difference available weight/price.
        super(9071.85, 100000000);
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }
}
