public class PcSetupPricing {
    public double budget;
    private double averageCostOfDesk = 125;
    private double averageCostOfChair = 80;
    private double averageCostOfKeyboard = 45;
    private double averageCostOfMouse = 30;

    private String nameOfGpu;

    private String nameOfCpu;

    private String nameOfMotherboard;

    private String nameOfPowerSupply;

    private String nameOfCase;

    private String nameOfRam;

    public PcSetupPricing(double userBudget, String setup) {
        this.budget = userBudget;
        while(budget<300){
            budget++;
        }
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
                nameOfGpu = "Four solid choices: RTX 3050, RTX 3060(if on sale), Rx 6600xt, Rx 6700xt(higher end)";
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
        else {
           double costGPu = 80;
           return costGPu;
           nameOfGpu = "GT 710";
        }

    }

    public double getCpuPrice(){
        if (budget < 300){
            nameOfCpu = "Budget too low";
        }
        if (budget < 600 && budget >= 300) {
            double costCpu = 100;
            return costCpu;
            nameOfCpu = "Three solid choices: i3 9100f, Ryzen 5 3600, Amd 5 5500,  )";

        }
        if (budget >= 600 && budget < 900 ){
            double costCpu = 200;
            return costCpu;
            nameOfCpu = "Four solid choices: Ryzen 5 5600, Ryzen 5700x, Intel i5 12400, Ryzen 7 5700g  "
        }

        if (budget >= 900 && budget < 1200){
            double costCpu = 300;
            return costCpu;
            nameOfCpu = "Two solid options: Ryzen 5 7600x, Ryzen 7 5800x, ";
        }
        if (budget >= 1200 ) {
            double costCpu = 550;
            return costCpu;
            nameOfCpu = "Multiple solid options: i9 12900k, i9 12900kf, Ryzen 9 5900x,  ";

        }
        return 100;
        nameOfCpu = "Three solid choices: i3 9100f, Ryzen 5 3600, Amd 5 5500,  )";

    }

    public double getMotherBoard(){
        double costMotherBoard =100;
        nameOfMotherboard = "Ryzen Motherboards: B550(for 5000 series chips) and B450(for 3000 series chips), Intel motherboards: z790 or z690";
        return costMotherBoard;
    }
    public double getPowerSupplyPrice(){
    double costPowerSupply = 80;
    }

    public double getCaseCost(){
        if (budget < 300){
            nameOfCpu = "Budget too low";
        }
        if (budget < 600 && budget >= 300) {
            double costPower= 40;
            return costPower;
            nameOfPowerSupply = "500";

        }
        if (budget >= 600 && budget < 900 ){
            double costCpu = 50;
            return costCpu;
            nameOfPowerSupply = "550 watt power supply"
        }

        if (budget >= 900 && budget < 1200){
            double costCpu = 60;
            return costCpu;
            nameOfPowerSupply = "600 watt power supply";
        }
        if (budget >= 1200 ) {
            double costCpu = 80;
            return costCpu;
            nameOfPowerSupply = " 750 watt powers supply(preferably high rated brands such as seasonic) ";

        }
        return 50;
        nameOfPowerSupply = "500 watts";

    }

    public double getRamCost(){

        if (budget >= 900 && budget < 1200){
            double costCpu = 300;
            return costCpu;
            nameO = "Two solid options: Ryzen 5 7600x, Ryzen 7 5800x, ";
        }
        if (budget >= 1200 ) {
            double costCpu = 550;
            return costCpu;
            nameOfCpu = "Multiple solid options: i9 12900k, i9 12900kf, Ryzen 9 5900x,  ";

        }
        return 100;
        nameOfCpu = "Three solid choices: i3 9100f, Ryzen 5 3600, Amd 5 5500,  )";

    }

}
