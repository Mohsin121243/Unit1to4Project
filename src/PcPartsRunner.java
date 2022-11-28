import java.util.Scanner;
public class PcPartsRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the PcPartsConfigurator! In this program we will give you options for pc parts bases on your budget.");
        System.out.println("Note that the prices given are rough estimates of the current prices of pc parts due to the fluctuations in prices");
        System.out.println("PLEASE CHOOSE A BUDGET OVER $300!!!");
        System.out.println("");

        System.out.print("What is your budget? ");
        String initialBudget = s.nextLine();
        System.out.println("");
        double secondBudget = Double.parseDouble(initialBudget);
        while(secondBudget <= 300){
            System.out.print("Budget too low. Type a higher budget: ");
            initialBudget = s.nextLine();
            System.out.println("");
            secondBudget = Double.parseDouble(initialBudget);
        }

        System.out.print("Would you like to include an entire setup?(including keyboard,a mouse, and a desk) Type yes or no: ");
        String setup = s.nextLine();
        System.out.println("");

        System.out.print("Would you like to play games as well? Type yes or no: ");
        String games = s.nextLine();
        System.out.println("");

        double newBudget = Double.parseDouble(initialBudget);

        PcSetupPricing a = new PcSetupPricing(newBudget, setup);
        System.out.println("Budget with tax and tax reducted " + "$" + a.budget);

        System.out.print("Here is the cpu price: $");
        System.out.println(a.getCpuPrice());

        System.out.print("Here is the gpu price: $");
        System.out.println(a.getGpuPrice(games));

        System.out.print("Here is the ram price: $");
        System.out.println(a.getRamCost());


        System.out.print("Here is the motherboard price: $");
        System.out.println(a.getMotherBoard());

        System.out.print("Here is the power supply price: $");
        System.out.println(a.getPowerSupplyCost());

        System.out.print("Here is the case price: $60 " );
        a.getCase();
        System.out.println();

        System.out.println(a.toString());

    }
}


