public class Circle extends GeoFigs{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        var area = radius * radius * 3.14;
        System.out.println(area);
        return area;

    }
}
