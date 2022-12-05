
public class Main {
    public static void main(String[] args) {


        Engine e1 = new Engine(600, Engine.TYPE.GAS, 50);
        Tank t1 = new Tank(800);
        e1.setEngineUtilization(100);
        e1.drive(70);
        rearMirror r1 = new rearMirror(110,0);
        rearMirror r2 = new rearMirror(100,-50);
        Tire tire1 = new Tire("PirelliPZero", 40);
        Tire tire2 = new Tire("PirelliPZero", 40);
        Tire tire3 = new Tire("PirelliPZero", 20);
        Tire tire4 = new Tire("PirelliPZero", 20);


        Car c1 = new Car("Lamborghini","69420","yellow", t1, e1);
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTires(tire1);
        c1.addTires(tire2);
        c1.addTires(tire3);
        c1.addTires(tire4);
        c1.honk();
        System.out.println(c1.getRearMirrors().get(1).getPosition());
        System.out.println(c1.getTires().get(2).getRadius());


    }
}