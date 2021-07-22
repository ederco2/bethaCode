package Desafio05;

import java.awt.*;
import java.util.ArrayList;

public class BethaFolhaMain {
    public static void main(String[] args) {
        Funcionario funcionario = criaFuncionarioBuilder.criaFuncionarioBuilder("Estagiario");
        ArrayList<String> desconto = new ArrayList<>();

        System.out.println(funcionario);
    }

    public class criaFuncionarioBuilder{
        public static Funcionario criaFuncionarioBuilder(String tipo){
            if (tipo.equals("Analista")) {
                return new Analista(1,"eder","04371939937",1000.00);
            }else if(tipo.equals("Estagiario")){
                return new Estagiario(2,"jose","04785231644",500.00);
            }else if (tipo.equals("Coordenador")){
                return new Coordenador(3,"Bill","98765432115",700.00);
            }else return new ArquitetoSoft(4,"Joe","15456954875",800.00);
        }
    }
}
