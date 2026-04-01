import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        if (n < 0) {
            System.out.println("Error");
        } else if (n == 0) {
            System.out.println("No one to meet");
        } else {
            for (int i = 0; i < n; i++) {
                String name = sc.nextLine();
                System.out.println("Hello, " + name);
            }
        }
    }
}