public class Car {

    private int fuelAmount;
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;
    public Car (int fuelAmount, int fuelConsumption, String brand, String serialNumber, String color){

        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public void drive(){
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("Driving the car");
    }

    public void breaking(){
        System.out.println("I am breaking");
    }

    public void turboBoost(){
        if(fuelAmount < fuelAmount * 0.1 ){
            System.out.println("SuperBoostMode");
        }else{
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut" + "Amount: " + i);
        }
    }

    public void getRemainingRange(){
        int x = fuelAmount / fuelConsumption;
        System.out.println(x + " Units remaining");
    }


}
