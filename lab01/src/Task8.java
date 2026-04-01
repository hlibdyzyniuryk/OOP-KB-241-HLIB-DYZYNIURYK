import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;

            sum += num;
            count++;
        }

        System.out.println(sum / count);
    }
}