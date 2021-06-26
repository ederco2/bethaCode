import java.util.Arrays;

public class OrdenacaoArray {
    public static void main(String[] args) {
        int[] arrayInteiro = new int[1000];

        for (int i = 1000; i > 0; i--) {
            arrayInteiro[arrayInteiro.length - i] = i;
        }
        boolean estOrdenado = false;

        long inicio = System.currentTimeMillis();

        while (!estOrdenado) {
            estOrdenado = true;
            for (int i = 1; i < arrayInteiro.length; i++) {
                if (arrayInteiro[i - 1] > arrayInteiro[i]) {
                    estOrdenado = false;
                    int aux = arrayInteiro[i];
                    arrayInteiro[i] = arrayInteiro[i - 1];
                    arrayInteiro[i - 1] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo ordenar 1: " + (fim - inicio) + " ms");
        for (int i = 1000; i > 0; i--) {
            arrayInteiro[arrayInteiro.length - i] = i;

        }
        inicio = System.currentTimeMillis();
        Arrays.sort(arrayInteiro);
        fim = System.currentTimeMillis();
        System.out.println("Tempo ordenar 2: " + (fim - inicio) + " ms");
    }
}

