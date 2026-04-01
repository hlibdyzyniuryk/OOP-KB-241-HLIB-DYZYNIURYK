import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (a <= b) {
            System.out.println("Impossible");
            return;
        }

        int days = 0;
        int height = 0;

        while (true) {
            days++;
            height += a;

            if (height >= h) break;

            height -= b;
        }

        System.out.println(days);
    }
}