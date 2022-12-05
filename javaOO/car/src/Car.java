import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String serialNumber;
    private String color;
    private Engine engine;
    private Tank tank;
    private List<rearMirror> rearMirrors;
    private List<Tire> tires;


    public Car(String brand, String serialNumber, String color, Tank tank, Engine engine) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.tank = tank;
        this.engine = engine;
        this.rearMirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }
    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }


    public void addTires(Tire tire){
        this.tires.add(tire);
    }

    public List<Tire> getTires(){
        return tires;
    }

    public void addMirror(rearMirror rearMirror){
        this.rearMirrors.add(rearMirror);
    }
    public List<rearMirror> getRearMirrors() {
        return rearMirrors;
    }

    public void brake() {
        System.out.println("Breaking");
    }

    public void turboBoost() {
        if (this.tank.getCurrentFuelAmount() > (this.tank.getCurrentFuelAmount() * 0.1)) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel for Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuuuuuuuuuuuuuuuuuuuuuuuuuuutt!!!!");

        }
    }

    public void honk(){
        System.out.println("Brand: " + this.brand + " Color: " + this.color + "Horsepower: " + this.getEngine().getHorsePower() + " ps");
    }

    public void getRemainingRange() {
        System.out.println((this.tank.getCurrentFuelAmount() / this.engine.getFuelConsumption()) * 100 + " remaining range");
    }
}