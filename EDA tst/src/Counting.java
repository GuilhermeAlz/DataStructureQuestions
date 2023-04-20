import java.util.Arrays;
import java.util.Scanner;

class Counting {

    public static int[] countingSort(int[] array, int k) {
        int[] contagem = new int[k + 1];

        for (int i = 0; i < array.length; i++) {
            contagem[array[i]] += 1;
            System.out.println(Arrays.toString(contagem)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        }
        for (int i = 1; i < contagem.length; i++) {
            contagem[i] += contagem[i - 1];
        }
        System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(contagem)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));

        int[] sorted = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            sorted[contagem[array[i]] - 1] = array[i];
            contagem[array[i]] -= 1;
        }
        System.out.println(Arrays.toString(contagem).replace("[", "")
                .replace("]", "")
                .replace(",", ""));

        return sorted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayS = sc.nextLine().split(" ");
        int[] array = new int[arrayS.length];
        for (int i = 0; i < arrayS.length; i++) {
            array[i] = Integer.parseInt(arrayS[i]);
        }
        int k = sc.nextInt();

        System.out.println(Arrays.toString(countingSort(array, k))
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
