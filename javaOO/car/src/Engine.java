public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type; // Diesel oder Benzin
    private int fuelConsumption;
    private int engineUtilization;


    public Engine(int horsePower, TYPE type, int fuelConsumption) {
        this.horsePower = horsePower;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
    }

    // amount should be between 0 and 100
    public void drive(int amount){
        System.out.println("The motor is running with " + amount);
    }

    public int getHorsePower(){
        return horsePower;
    }

    public TYPE getType(){
        return type;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getEngineUtilization() {
        return engineUtilization;
    }

    public void setEngineUtilization(int engineUtilization) {
        this.engineUtilization = engineUtilization;
    }
}
