import java.util.Scanner;

class WarmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multiplicador = sc.nextInt();
        sc.nextLine();
        String[] numeros = sc.nextLine().split(" ");
        sc.close();

        String out = "";
        for (int i = 0; i < numeros.length; i++) {
            int numTemp = Integer.parseInt(numeros[i]);
            out += numTemp * multiplicador + " ";
        }
        System.out.println(out.trim());
    }
}
