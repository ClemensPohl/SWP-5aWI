import java.awt.*;

public class Cars {

    private Color color;
    private String brand;
    private int basePrice;
    private int km;
    private Producer producer;
    private EngineX engineX;

    public Cars(Color color, String brand, int basePrice, int km, Producer producer, EngineX engineX) {
        this.color = color;
        this.brand = brand;
        this.basePrice = basePrice;
        this.km = km;
        this.producer = producer;
        this.engineX = engineX;
    }

    public void NewPrice(){
        this.basePrice = this.basePrice - this.producer.getDiscount();
        System.out.println("The new Price is: " + this.basePrice);
    }

    public double Consumption(){
        if(this.getKm() < 50000){
            return this.getEngineX().getBaseConsumption();
        }else{
            return this.getEngineX().getBaseConsumption() * 0.098 + this.getEngineX().getBaseConsumption();
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public EngineX getEngineX() {
        return engineX;
    }

    public void setEngineX(EngineX engineX) {
        this.engineX = engineX;
    }
}
