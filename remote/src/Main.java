public class Main {
    public static void main(String[] args) {

        Remote remote = new Remote(false,false);
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(70);
        remote.addBattery(battery1);
        remote.addBattery(battery2);

        remote.TurnOn();
        remote.TurnOff();

    }
}