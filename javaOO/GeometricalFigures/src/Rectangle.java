public class Rectangle extends GeoFigs{

    private int x;
    private int y;

    public Rectangle(String name, int x, int y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        var area = x * y;
        System.out.println(area);
        return area;
    }
}
