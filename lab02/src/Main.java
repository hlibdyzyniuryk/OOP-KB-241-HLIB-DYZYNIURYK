public class Main {
    public static void main(String[] args)
    {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);
        System.out.println("Line Intersection: " + line1.intersection(line2));

        Segment s1 = new Segment(new Point(0,0), new Point(4,4));
        Segment s2 = new Segment(new Point(0,4), new Point(4,0));
        System.out.println("Segment Length: " + s1.length());
        System.out.println("Segment Middle: " + s1.middle());
        System.out.println("Segment Intersection: " + s1.intersection(s2));

        Triangle t = new Triangle(new Point(0,0), new Point(4,0), new Point(2,3));
        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Centroid: " + t.centroid());
    }
}