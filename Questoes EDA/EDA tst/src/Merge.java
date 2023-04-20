import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] a1, int[] a2) {
        int[] helper = new int[a1.length + a2.length];
        for (int i = 0; i < helper.length; i++) {
            if (i < a1.length) {
                helper[i] = a1[i];
            } else {
                helper[i] = a2[i - a1.length];
            }
        }

        int right = helper.length - 1;
        int meio = a1.length - 1;
        int i = 0;
        int j = meio + 1;

        int[] output = new int[helper.length];
        int k = 0;

        while (i <= meio && j <= right) {
            if (helper[i] <= helper[j]) {
                output[k++] = helper[i++];
            } else {
                output[k++] = helper[j++];
            }
        }

        while (i <= meio) {
            output[k++] = helper[i++];
        }

        while (j <= right) {
            output[k++] = helper[j++];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] a = {2,5,7,9,13,45,89};
        int[] b = {1,3,5,6,10,15,26};
        System.out.println(Arrays.toString(merge(a, b)));
    }
}
