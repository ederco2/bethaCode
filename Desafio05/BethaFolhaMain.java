package Desafio05;

public class BethaFolhaMain {
    public static void main(String[] args) {
        System.out.println("Nada Aqui");

        Funcionario estagiario = new Estagiario(1,"Eder","04371939937",1000.00);
        System.out.println(estagiario.getSalarioBruto());

        Funcionario analista = new Analista(1,"Eder","04371939937",1000.00);
        System.out.println(analista.getSalarioBruto());

    }
}
