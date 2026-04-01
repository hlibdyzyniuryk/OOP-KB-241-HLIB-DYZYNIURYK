public class Main4 {
    public static void main(String[] args) {
        Figure t = new Triangle1(new Point1(0,0), new Point1(4,0), new Point1(0,3));
        Figure q = new Quadrilateral(
                new Point1(0,0),
                new Point1(4,0),
                new Point1(4,3),
                new Point1(0,3)
        );
        Figure c = new Circle(new Point1(0,0), 5);

        System.out.println(t);
        System.out.println("Area: " + t.area());
        System.out.println("Centroid: " + t.centroid().x + "," + t.centroid().y);

        System.out.println(q);
        System.out.println("Area: " + q.area());

        System.out.println(c);
        System.out.println("Area: " + c.area());
    }
}