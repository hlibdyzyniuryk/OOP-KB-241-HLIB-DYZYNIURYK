import java.util.ArrayList;

public class Task13 {
    public static int[] removeLocalMaxima(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && i < arr.length - 1 &&
                    arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                continue;
            }
            list.add(arr[i]);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}