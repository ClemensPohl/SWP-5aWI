public class EngineX {

    public enum TYPE {DIESEL, GAS}
    private TYPE type;
    private int horsePower;
    private double baseConsumption;
    private int maxSpeed;

    public EngineX(TYPE type, int horsePower, double baseConsumption, int maxSpeed) {
        this.type = type;
        this.horsePower = horsePower;
        this.baseConsumption = baseConsumption;
        this.maxSpeed = maxSpeed;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
