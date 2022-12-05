public class LightElement {
    private String name;
    private String color;
    private int powerUsage;
    private boolean status = false;


    public LightElement(String name, String color, int powerConsumption, boolean status) {
        this.name = name;
        this.color = color;
        this.powerUsage = powerConsumption;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPowerConsumption() {
        return powerUsage;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerUsage = powerConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
