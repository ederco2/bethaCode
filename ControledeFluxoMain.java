public class ControledeFluxoMain {
    public static void main(String[] args) {
        int ano = 2020;

        Double altura = 1.4;

        if (ano < 0) {
            System.out.println("Nao é um ano");

        } else if ((ano % 4 == 0 && ano % 100 == 0) || (ano % 400 == 0)) {
            System.out.println("É bissesto");
        } else {
            System.out.println("Nao é bissesto");
        }

        if (10 == 20) {
            System.out.println("É igual");
        } else {
            System.out.println("É diferente");
        }

        if (altura < 1.5) {
            System.out.println("Baixinho");
        } else {
            System.out.println("Altinho");
        }
        Double salario = 15.000;

        if (salario >= 15.000) {
            System.out.println("É o Carrion o gaucho das galaxias");
        } else {
            System.out.println("Não é ele");
        }


    }
}
