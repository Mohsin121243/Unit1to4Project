public class PcSetupPricing {
    private double budget;
    private double averageCostOfDesk = 125;
    private double averageCostOfChair = 80;
    private double averageCostOfKeyboard = 45;
    private double averageCostOfMouse = 30;

    private String nameOfGpu;

    private String nameOfCpu;

    private String nameOfMotherboard;

    private String nameOfPowerSupply;

    private String nameOfCase;

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
        if(games.equals("yes")==true ||games.equals("Yes") == true) {
            if (budget < 300){
                nameOfGpu = "Budget too low";
            }
            if (budget < 600 && budget >= 300) {
                double costGpu = 125;
                return costGpu;
                nameOfGpu = "Three solid choices: Gtx 1060 by Nvidia or the Rtx 550 by AMD, Rtx 580(if on sale)";

            }
            if (budget >= 600 && budget < 900 ){
                double costGpu = 330;
                return costGpu;
                nameOfGpu = "Four solid choices: RTX 3050, RTX 3060(if on sale), Rx 6600xt, Rx 6700xt(higher end)"
            }

            if (budget >= 900 && budget < 1200){
                double costGpu = 550;
                return costGpu;
                nameOfGpu = "Four solid options: Rtx 3070, Rx 6750xt,  Rtx 3060 Ti";
            }
            if (budget >= 1200 ) {
                double costGpu = 750;
                return costGpu;
                nameOfGpu = "Multiple solid options: Rx 6900xt or Rx 6950xt, Rtx 3080, Rtx 3090, Rtx 4090(VERY HIGH END)";

            }

        }

    }

    public double getCpuPrice(){

    }

    public double getPowerSupplyPrice(){

    }

    public double getCaseCost(){

    }

    public double getRamCost(){

    }

}
