import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        ArrayList<Rocket> U1Phase1 = simulation.loadU1(1);
        ArrayList<Rocket> U2Phase1 = simulation.loadU2(1);
        ArrayList<Rocket> U1Phase2 = simulation.loadU1(2);
        ArrayList<Rocket> U2Phase2 = simulation.loadU2(2);

        long U1BudgetPhase1 = simulation.runSimulation(U1Phase1);
        long U2BudgetPhase1 = simulation.runSimulation(U2Phase1);
        long U1BudgetPhase2 = simulation.runSimulation(U1Phase2);
        long U2BudgetPhase2 = simulation.runSimulation(U2Phase2);

        System.out.println("The budget for U1 during Phase 1 is: " + U1BudgetPhase1);
        System.out.println("The budget for U2 during Phase 1 is: " + U2BudgetPhase1);
        System.out.println("The budget for U1 during Phase 2 is: " + U1BudgetPhase2);
        System.out.println("The budget for U2 during Phase 2 is: " + U2BudgetPhase2);
    }
}
