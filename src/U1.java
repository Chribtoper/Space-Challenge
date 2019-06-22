public class U1 extends Rocket {

    public U1() {
        // I call the Parents constructor to add a custom "weight" and "price" since children classes of "Rocket" have difference available weight/price.
        super(9071.85, 100000000);
    }

    public boolean launch() {
        if ((Math.random() >= .05 * this.weightDivide())) {
            return true;
        } else {
            System.out.println("Explosion");
            return false;
        }
    }

    public boolean land() {
        if ((Math.random() >= .01 * this.weightDivide())) {
            return true;
        } else {
            System.out.println("Crash");
            return false;
        }
    }
}
