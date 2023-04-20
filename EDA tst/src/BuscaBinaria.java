import java.util.Arrays;

public class BuscaBinaria {
    public static void partition(int[] array) {
        int pivot = array[0];
        int i = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] < pivot) {
                i++;
                Util.Swap(array, i, j);
            }
        }
        Util.Swap(array, i, 0);
    }

    public static void main(String[] args) {
        int[] array = {12,3,5,76,3,45,437,234,6, 74, 5, 3};
        partition(array);
        System.out.println(Arrays.toString(array));
    }
}
