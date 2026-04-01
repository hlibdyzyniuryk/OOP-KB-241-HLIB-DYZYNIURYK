public class Task11 {
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int sum = 0;
        for (int x : arr) {
            if (x % 2 == 0) sum += x;
        }
        return sum;
    }
}