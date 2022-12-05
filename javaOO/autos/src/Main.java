import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Producer producer1 = new Producer("Lamborghini","Italy",20000);
        EngineX e1 = new EngineX(EngineX.TYPE.GAS,700,60,450);
        Cars car1 = new Cars(new Color(255,0,0),"Aventador",1000000,60000,producer1,e1);

        car1.NewPrice();
        System.out.println(car1.getEngineX().getBaseConsumption());
        System.out.println(car1.Consumption());

    }
}