public class Circle extends Figure {
    private Point1 center;
    private double radius;

    public Circle(Point1 center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Некоректний радіус");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point1 centroid() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle[(" + center.x + "," + center.y + ") " + radius + "]";
    }
}