
public class ControleFluxoMain {
    public ControleFluxoMain() {
    }

    public static void main(String[] args) {
        int ano = 2020;
        Double altura = 1.4D;
        if (ano < 0) {
            System.out.println("Nao é um ano");
        } else if ((ano % 4 != 0 || ano % 100 != 0) && ano % 400 != 0) {
            System.out.println("Nao é bissesto");
        } else {
            System.out.println("É bissesto");
        }

        System.out.println("É diferente");
        if (altura < 1.5D) {
            System.out.println("Baixinho");
        } else {
            System.out.println("Altinho");
        }

        Double salario = 15.0D;
        if (salario >= 15.0D) {
            System.out.println("É o Carrion o gaucho das galaxias");
        } else {
            System.out.println("Não é ele");
        }

    }
}
