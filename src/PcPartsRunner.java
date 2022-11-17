import java.util.Scanner;
public class PcPartsRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your budget");
        String initialBudget = s.nextLine();
        System.out.println("");
        System.out.print("Would you like to include an entire setup? Type yes or no");
        String setup = s.nextLine();
        System.out.println("");
        double newBudget = Double.parseDouble(initialBudget);
        PcSetupPricing a = new PcSetupPricing(newBudget, setup);
        System.out.println("Budget with tax and tax reducted" + a.budget);
    }
}


