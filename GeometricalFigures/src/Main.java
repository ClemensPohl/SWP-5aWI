public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("Circle1", 4);
        Circle c2 = new Circle("Circle2", 2);

        Rectangle r1 = new Rectangle("Rectangle1",4,2 );

        Cube cu1 = new Cube("Cube1", 3);
        
        c1.getArea();
        c2.getArea();
        cu1.getArea();
        r1.getArea();

    }
}