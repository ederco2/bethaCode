public class Caixa {
    public static void main(String[] args) {
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        int quantidadeTotal = 0;

        int valorReais = 163;

        for (int i = 0; i < cedulas.length; i++) {

            int quantidadeCedulas = valorReais / cedulas[i];

            System.out.println("Quantidade de cedulas: " + cedulas[i] + " : " + quantidadeCedulas);

            valorReais %= cedulas[i];

            quantidadeTotal += quantidadeCedulas;
        }
        System.out.println("Quantidade total: " + quantidadeTotal);
    }
}
