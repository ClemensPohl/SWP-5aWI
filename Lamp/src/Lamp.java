import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> lightElements;

    private String name;

    public Lamp(String name) {
        this.name = name;
        this.lightElements = new ArrayList<>();
    }

    public void turnOn(LightElement lightElement){
        if(lightElement.isStatus() == true){
            System.out.println("My Name is: " + lightElement.getName() + "." + "I am already turned on.");
        }else{
            lightElement.setStatus(true);
            lightElement.setPowerConsumption(lightElement.getPowerConsumption() + 5);
        }

    }
    public void addLightElement(LightElement lightElement){
        this.lightElements.add(lightElement);
    }

    public void turnAllOn(){
        for (int i = 0; i < lightElements.size(); i++) {
            this.lightElements.get(i).setStatus(true);
        }
    }

    public double getOverallPowerUsage(){
        int sumUsage = 0;
        for (int i = 0; i < this.lightElements.size(); i++) {
            sumUsage += this.lightElements.get(i).getPowerConsumption();

        }
        return sumUsage;
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < lightElements.size(); i++) {
            System.out.println(this.lightElements.get(i).getName());
        }
    }
}
