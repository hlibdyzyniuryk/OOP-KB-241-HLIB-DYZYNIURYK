public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(array)); // Має вивести 12 (2+4+6)
    }

    public static int sum(int[] array) {
        if (array == null || array.length == 0) return 0;
        int totalSum = 0;
        for (int num : array) {
            if (num % 2 == 0) totalSum += num;
        }
        return totalSum;
    }
}