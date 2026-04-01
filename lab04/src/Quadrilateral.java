public class Quadrilateral extends Figure {
    private Point1 a, b, c, d;

    public Quadrilateral(Point1 a, Point1 b, Point1 c, Point1 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private double triangleArea(Point1 p1, Point1 p2, Point1 p3) {
        return Math.abs((p1.x*(p2.y-p3.y) + p2.x*(p3.y-p1.y) + p3.x*(p1.y-p2.y)) / 2.0);
    }

    @Override
    public double area() {
        return triangleArea(a,b,c) + triangleArea(a,c,d);
    }

    @Override
    public Point1 centroid() {
        return new Point1((a.x + b.x + c.x + d.x)/4, (a.y + b.y + c.y + d.y)/4);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A(" + a.x + "," + a.y + ") B(" + b.x + "," + b.y + ") C(" + c.x + "," + c.y + ") D(" + d.x + "," + d.y + ")]";
    }
}