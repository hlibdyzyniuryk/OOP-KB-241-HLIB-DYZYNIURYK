import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        final int password = 1234;

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}