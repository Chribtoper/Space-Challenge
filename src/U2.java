public class U2 extends Rocket {

    public U2() {
        // I call the Parents constructor to add a custom "weight" and "price" since children classes of "Rocket" have difference available weight/price.
        super(16329.3, 120000000);
    }

    public boolean launch() {
        if ((Math.random() >= .04 * this.weightDivide())) {
            return true;
        } else {
            System.out.println("Explosion");
            return false;
        }
    }

    public boolean land() {
        if ((Math.random() >= .08 * this.weightDivide())) {
            return true;
        } else {
            System.out.println("Crash");
            return false;
        }
    }
}
