public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("Lampe1");
        LightElement le1 = new LightElement("LE1","Red",3, true);
        LightElement le2 = new LightElement("LE2","Red",3, false);
        LightElement le3 = new LightElement("LE3","Red",3, false);

        lamp1.addLightElement(le1);
        lamp1.addLightElement(le2);
        lamp1.addLightElement(le3);

        lamp1.printNamesOfLightElements();
        lamp1.turnAllOn();

        System.out.println(le1.isStatus());
        System.out.println(le2.isStatus());
        System.out.println(le3.isStatus());
        System.out.println(lamp1.getOverallPowerUsage());






    }
}