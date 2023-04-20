import java.util.Scanner;

class VetorCircular {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String[] valores = sc.nextLine().split(" ");
        int tamanho = sc.nextInt();
        sc.close();
    
        String out = "";
        for (int i = 0; i < tamanho; i ++) {
            if (i < valores.length) {
                out += valores[i] + " ";
            } else {
                int indice = i % valores.length;
                out += valores[indice] + " ";
            }
        }
        System.out.println(out.trim());
    }   
}
