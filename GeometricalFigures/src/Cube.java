public class Cube extends GeoFigs{

    private double a;

    public Cube(String name, double a) {
        super(name);
        this.a = a;
    }

    //6* a * a


    @Override
    public double getArea() {
        var area = 6 * a * a;
        System.out.println(area);
        return area;
    }
}
