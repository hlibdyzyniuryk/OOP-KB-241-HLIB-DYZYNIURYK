public class Triangle1 extends Figure {
    private Point1 a, b, c;

    public Triangle1(Point1 a, Point1 b, Point1 c) {
        if (area(a, b, c) == 0) {
            throw new IllegalArgumentException("Вироджений трикутник");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double area(Point1 a, Point1 b, Point1 c) {
        return Math.abs((a.x*(b.y-c.y) + b.x*(c.y-a.y) + c.x*(a.y-b.y)) / 2.0);
    }

    @Override
    public double area() {
        return area(a, b, c);
    }

    @Override
    public Point1 centroid() {
        return new Point1((a.x + b.x + c.x)/3, (a.y + b.y + c.y)/3);
    }

    @Override
    public String toString() {
        return "Triangle[A(" + a.x + "," + a.y + ") B(" + b.x + "," + b.y + ") C(" + c.x + "," + c.y + ")]";
    }
}