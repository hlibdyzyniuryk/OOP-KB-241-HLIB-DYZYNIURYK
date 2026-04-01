public class Task12 {
    public static boolean[] getSumCheckArray(int[] arr) {
        boolean[] result = new boolean[arr.length];

        for (int i = 2; i < arr.length; i++) {
            result[i] = arr[i] == arr[i-1] + arr[i-2];
        }

        return result;
    }
}