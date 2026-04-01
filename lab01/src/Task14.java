public class Task14 {

    public static void cycleSwap(int[] arr) {
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    public static void cycleSwap(int[] arr, int shift) {
        for (int i = 0; i < shift; i++) {
            cycleSwap(arr);
        }
    }
}