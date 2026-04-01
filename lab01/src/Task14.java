import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 4};
        cycleSwap(arr1);
        System.out.println("Shift 1: " + Arrays.toString(arr1));

        int[] arr2 = {1, 3, 2, 7, 4};
        cycleSwap(arr2, 3);
        System.out.println("Shift 3: " + Arrays.toString(arr2));
    }

    public static void cycleSwap(int[] array) {
        if (array.length <= 1) return;
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1 || shift % array.length == 0) return;
        int n = array.length;
        shift = shift % n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + shift) % n] = array[i];
        }
        System.arraycopy(temp, 0, array, 0, n);
    }
}