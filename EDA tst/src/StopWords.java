import java.util.Scanner;

class StopWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frase = sc.nextLine().split(" ");
        String[] stopWords = sc.nextLine().split(" ");

        String out = "";
        for (int i = 0; i < frase.length; i++) {
            boolean check = true;
            for (int j = 0; j < stopWords.length; j++) {
                if (frase[i].equals(stopWords[j])) {
                    check = false;
                }
            }
            if (check) {
                out += frase[i] + " ";
            }
        }
        System.out.println(out.trim());
    }
}
