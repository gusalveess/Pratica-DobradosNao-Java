public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dobrados Não!:");
        String[] meuArray1 = new String[]{"Morango", "Caju", "Acerola", "Manga"};
        String[] meuArray2 = new String[]{"Pêra", "Caju", "Morango", "Kiwi"};
        DobradosNao(meuArray1, meuArray2);
    }

    public static void DobradosNao(String[] array1, String[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {
                    System.out.println(array2[j]);
                }
            }
        }

    }
}
