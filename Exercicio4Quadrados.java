//Faça um programa que imprima os quadrados dos números inteiros ímpares entre 15 e 35.

public class Exercicio4Quadrados {
    public static void main(String[] args){
        int x=35;

        for (int i=15;i<=x;i++){
            if(i%2!=0) {
                System.out.println("Numero: "+i+" Resultado: "+ i * i);
            }
        }
    }
}
