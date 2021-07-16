package Desafio04;

public class Desafio04Main {
    public static void main(String[] args) {

        cliente cliente = new cliente(1,"Eder","Afonso Celso","999931417","04371939937","45695143","M",1000.00,100.00);
        funcionario funcionario = new funcionario(1,"Joao da Silva","Rua Joao Serafim","34389498","07119464930","6549876","F",1000.00,950.00);
        fornecedor fornecedor = new fornecedor(3,"Erick","ALvaro Catao","34334679","2258357499","456951753","478990199","Zelia Silva","Entregas de Segunda a Sexta 08:00 as 16:00");

        cliente.aumentaLimite(33300.00);
        cliente.getNumeroDocumento();
        System.out.println(cliente);

        System.out.println("--------------------------");
        funcionario.setSalarioBruto(1250.00);
        System.out.println(funcionario);
        System.out.println("--------------------------");
        fornecedor.getNumeroDocumento();
        fornecedor.setObservacao("Entrega de Segunda a Quinta das 8:00 as 18:00");
        System.out.println(fornecedor);
    }
}
