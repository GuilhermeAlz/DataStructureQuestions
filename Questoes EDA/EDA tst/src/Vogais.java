public class Vogais {
    public static void vogaisRepetidas(String[] vogais) {
        int[] contagemVogais = {0, 0, 0, 0, 0};
        String[] vogaisMap = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < vogais.length; i++) {
            for (int j = 0; j < vogaisMap.length; j++) {
                if (vogais[i].equals(vogaisMap[j])) {
                    contagemVogais[j] += 1;
                }
            }
        }
        for (int i = 0; i < contagemVogais.length; i++) {
            if (contagemVogais[i] > 1) {
                System.out.print(vogaisMap[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[] in = {"a", "e", "a", "i", "o", "e", "i"};
        vogaisRepetidas(in);
    }
}
