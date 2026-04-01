public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 2};
        System.out.println(max(array));
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) maxValue = array[i];
        }
        return maxValue;
    }
}