import java.util.Arrays;
import java.util.Scanner;

class TrocaVizinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numeros = sc.nextLine().split(" ");
        sc.close();
        int[] numerosInteiros = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numerosInteiros[i] = Integer.parseInt(numeros[i]);
        }

        for (int i = 0; i < numerosInteiros.length; i++) {
            int numTemp = numerosInteiros[i];

            if (i % 2 == 0) {
                if (i + 1 < numerosInteiros.length) {
                    numerosInteiros[i] = numerosInteiros[i + 1];
                    numerosInteiros[i + 1] = numTemp;
                }
            }
        }
        System.out.println(Arrays.toString(numerosInteiros));
    }
}
