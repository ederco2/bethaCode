package Desafio05;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BethaFolhaMain {
    public static void main(String[] args) {
        Integer tipo;
        Integer id;
        String nome;
        String cpf;
        Double salarioBruto;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo do funcionairo:\n");
        System.out.print("Estagiario: 1\n");
        System.out.print("Analista: 2\n");
        System.out.print("Arquiteto de Software: 3\n");
        System.out.print("Coordenador: 4\n");
        System.out.print("::");
        tipo = sc.nextInt();

        System.out.print("Informe o codigo do funcionario: ");
        id = sc.nextInt();

        System.out.print("Informe o nome: ");
        nome = sc.next();

        System.out.println("Informe o CPF: ");
        cpf =  sc.next();

        System.out.println("Informe o Salario:");
        salarioBruto =  sc.nextDouble();

        Funcionario funcionario = criaFuncionarioBuilder.criaFuncionarioBuilder(tipo,id,nome,cpf,salarioBruto);
        ArrayList<String> desconto = new ArrayList<>();


        Folha folhaAgosto = new Folha(1,funcionario,"15/07/2021");
        folhaAgosto.calcular();


        System.out.println(funcionario);

    }

    public class criaFuncionarioBuilder{
        public static Funcionario criaFuncionarioBuilder(Integer tipo, Integer id, String nome, String cpf, Double salarioBruto){
            if (tipo==2) {
                return new Analista(id,nome,cpf,salarioBruto);
            }else if(tipo==1){
                return new Estagiario(id,nome,cpf,salarioBruto);
            }else if (tipo==4){
                return new Coordenador(id,nome,cpf,salarioBruto);
            }else return new ArquitetoSoft(id,nome,cpf,salarioBruto);
        }
    }
}
