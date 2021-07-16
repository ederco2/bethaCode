package Desafio04;

public class Desafio04Main {
    public static void main(String[] args) {
        //pessoaFisica pesssoa = new pessoaFisica(1,"Eder","Rua Joao Serafim","999984117");
        cliente cliente = new cliente(1,"Eder","Afonso Celso","999931417","04371939937","45695143","M",1000.00,100.00);
        funcionario funcionario = new funcionario(1,"Joao da Silva","Rua Joao Serafim","34389498","07119464930","6549876","F",1000.00,950.00);

        System.out.println(cliente);
        System.out.println("--------------------------");
        System.out.println(funcionario);
    }
}
