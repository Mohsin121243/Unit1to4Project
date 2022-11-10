public class PcSetupPricing {
    private double budget;
    private double averageCostOfDesk = 125;
    private double averageCostOfChair = 80;
    private double averageCostOfKeyboard = 45;
    private double averageCostOfMouse = 30;

    public PcSetupPricing(int userBudget, String setup) {
        this.budget = userBudget;
        this.budget = this.budget - (0.04*this.budget);

        if(setup.equals("yes")==true || setup.equals("Yes") == true){
            if(budget<= 500 && budget >= 300){
                averageCostOfChair = 50;
                averageCostOfDesk = 80;
                averageCostOfKeyboard = 10;
                averageCostOfMouse = 10;
                this.budget = this.budget - (averageCostOfMouse + averageCostOfKeyboard + averageCostOfDesk + averageCostOfChair);

            }
            if (budget >= 1000){
                averageCostOfDesk = 150;
                averageCostOfChair = 100;
                averageCostOfKeyboard = 75;
                averageCostOfMouse = 50;
                this.budget = this.budget - (averageCostOfMouse + averageCostOfKeyboard + averageCostOfDesk + averageCostOfChair);

            }
        }
    }

    public double getGpuPrice(String games){
        if(budget < 400 && budget>= 300){
            

        }
    }
}
