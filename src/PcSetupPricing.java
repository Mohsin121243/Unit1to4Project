/**
 * The PcSetupPricing class takes all the user input and calculates the prices of the computer parts
 * and lists out the different options
 */
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

    /**
     * This constructor subtracts the tax out of the user budget. Also subtracts the cost of a setup(including keyboards
     * , mouses, and a desk) if the user says so
     * @param userBudget uses the users budget that was asked of him
     * @param setup if the user preferred a setup or not
     */
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

    /**
     * The method getGpuPrice calculates the price of the gpu based on the budget and lists out the options,
     * options are stored in its dedicated instance variables
     * @param games represents the users ansewer to the questions of whether they would like to play games or not
     * @return returns the rough estimate of the price of the gpu
     */
    public double getGpuPrice(String games){
        if(games.equals("yes")==true ||games.equals("Yes") == true) {
            if (budget < 300){
                nameOfGpu = "Budget too low";
            }
            else if (budget < 600 && budget >= 300) {
                double costGpu = 125;
                nameOfGpu = "Three solid choices: Gtx 1060 by Nvidia or the Rtx 550 by AMD, Rtx 580(if on sale)";
                return costGpu;

            }
            else if (budget >= 600 && budget < 900 ){
                double costGpu = 330;
                nameOfGpu = "Four solid choices: RTX 3050, RTX 3060(if on sale), Rx 6600xt, Rx 6700xt(higher end)";
                return costGpu;
            }

            else if (budget >= 900 && budget < 1200){
                double costGpu = 550;
                nameOfGpu = "Four solid options: Rtx 3070, Rx 6750xt,  Rtx 3060 Ti";
                return costGpu;
            }
            else if (budget >= 1200 ) {
                double costGpu = 750;
                nameOfGpu = "Multiple solid options: Rx 6900xt or Rx 6950xt, Rtx 3080, Rtx 3090, Rtx 4090(VERY HIGH END)";
                return costGpu;

            }

        }
        else {
           double costGPu = 80;
            nameOfGpu = "GT 710";
            return costGPu;
        }
        nameOfGpu = "GT 710";
        return 80;
    }

    /**
     * The getCpuPrice method calculates the rough price of the cpu and the list of options
     * based on the budget, which as the same for the gpu is also stored in its distinct instance variable.
     * @return returns the price of the cpu
     */
    public double getCpuPrice(){
        if (budget < 300){
            nameOfCpu = "Budget too low";
        }
        if (budget < 600 && budget >= 300) {
            double costCpu = 100;
            nameOfCpu = "Three solid choices: i3 9100f, Ryzen 5 3600, Amd 5 5500,  ";
            return costCpu;

        }
        if (budget >= 600 && budget < 900 ){
            double costCpu = 200;
            nameOfCpu = "Four solid choices: Ryzen 5 5600, Ryzen 5700x, Intel i5 12400, Ryzen 7 5700g  ";
            return costCpu;
        }

        if (budget >= 900 && budget < 1200){
            double costCpu = 300;
            nameOfCpu = "Two solid options: Ryzen 5 7600x, Ryzen 7 5800x, ";
            return costCpu;
        }
        if (budget >= 1200 ) {
            double costCpu = 550;
            nameOfCpu = "Multiple solid options: i9 12900k, i9 12900kf, Ryzen 9 5900x";
            return costCpu;

        }
        nameOfCpu = "Three solid choices: i3 9100f, Ryzen 5 3600, Amd 5 5500";
        return 100;

    }

    /**
     * The getMotherboard method also calculates the cost based on the user budget and store the options in a instance
     * varible
     * @return returns the cost of the motherboard
     */
    public double getMotherBoard(){
        double costMotherBoard =100;
        nameOfMotherboard = "Ryzen Motherboards: B550(for 5000 series chips) and B450(for 3000 series chips), Intel motherboards: z790 or z690";
        if (budget < 300){
            nameOfMotherboard = "Budget too low";
        }
        return costMotherBoard;
    }


    /**
     * The getPowerSupplyCost calculates the cost of the power supply and stores the number of watts in its designated
     * instance variable
     * @return returns the price of the power supply
     */
    public double getPowerSupplyCost(){
        if (budget < 300){
            nameOfCpu = "Budget too low";
        }
        if (budget < 600 && budget >= 300) {
            double costPower= 40;
            nameOfPowerSupply = "500 watt power supply";
            return costPower;

        }
        if (budget >= 600 && budget < 900 ){
            double costCpu = 50;
            nameOfPowerSupply = "550 watt power supply";
            return costCpu;
        }

        if (budget >= 900 && budget < 1200){
            double costCpu = 60;
            nameOfPowerSupply = "600 watt power supply";
            return costCpu;
        }
        if (budget >= 1200 ) {
            double costCpu = 80;
            nameOfPowerSupply = " 750 watt powers supply(preferably high rated brands such as seasonic) ";
            return costCpu;

        }
        nameOfPowerSupply = "500 watts";
        return 50;

    }

    /**
     * The getRamCost method calculates the cost of the ram and stores the number of gigabytes you need in its
     * designated instance variable
     * @return returns the cost of the ram
     */
    public double getRamCost(){
        if (budget < 300){
            nameOfRam = "Budget too low";
        }

        if (budget >= 600 && budget < 1200){
            double cost = 300;
            nameOfRam = "16 gb of ram";
            return cost;

        }
        if (budget >= 1200 ) {
            double cost = 550;
            nameOfRam = "32 gb of ram";
            return cost;

        }
        nameOfRam = "8 gb of ram";
        return 100;

    }

    /**
     * The getCase method uses Math.random to randomly choose one case out of a list of different cases and store it
     * in its designated instance variable
     */
    public void getCase(){

        int random = (int)((Math.random()*5)+1);
        String caseName;
        if (budget < 300){
            caseName = "Budget too low";
        }
        if(random == 1){
            caseName = "Corsair iCue RGB 5000x";
        }
        else if(random == 2){
            caseName = "Corsair Carbide Series SPEC-04 Tempered Glass ";
        }
        else if (random == 3) {
            caseName = "Nzxt H510";
        }
        else if (random == 4) {
            caseName = "Cooler Master H500P Mesh";
        }
        else if (random == 5) {
            caseName = "Lian Li Lancool 2 mesh";
        }
        else  {
            caseName = "Cooler Master Cosmos C700M";
        }
    nameOfCase = caseName;
    }

    /**
     * The toString method returns all the instance variables that were modified by the calling of the constructors and
     * the methods. So it basically lists out all the options
     * @return returns all the instance varibles/options.
     */
    public String toString(){
      String cpu = "CPU Options: " + nameOfCpu;
      String gpu = "GPU Options: " + nameOfGpu;
      String power = "Power Supply: " + nameOfPowerSupply;
      String ram = "Ram options: " + nameOfRam;
      String caseName = "Case: " + nameOfCase;
      String motherBoard = "MotherBoard options: " + nameOfMotherboard;

      return cpu + "\n" + gpu + "\n" + ram + "\n" + motherBoard + "\n" + power + "\n" + caseName;

    }
}
