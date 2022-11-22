import java.util.ArrayList;
import java.util.List;

public class Remote {
    private boolean isOn = false;

    private boolean hasPower = false;

    private List<Battery> battery;

    public Remote(boolean isOn, boolean hasPower) {
        this.isOn = isOn;
        this.hasPower = hasPower;
        this.battery = new ArrayList<>();
    }

    public void addBattery(Battery battery){
        this.battery.add(battery);
    }

    public void TurnOn(){
        System.out.println("Verbraucher angeschlossen");
        for (int i = 0; i < this.battery.size(); i++) {
            this.battery.get(i).setChargingStatus(this.battery.get(i).getChargingStatus() - 5);
        }
    }

    public void TurnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public void getStatus(){
        int x = 0;
        for (int i = 0; i < this.battery.size(); i++) {
        x += this.battery.get(i).getChargingStatus();
        }
        System.out.println("Mittelwert ist: " + x / this.battery.size() + "%");
    }



}
