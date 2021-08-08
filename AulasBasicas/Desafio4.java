//Escreva um programa que some todos os valores contidos em um array de inteiros e calcule a média.
public class Desafio4 {
    public static void main(String[] args){
        double valores[] = {10,50,20,30};
        double total =0;
        for (int i = 0; i < valores.length; i++) {
            total+=valores[i];
        }
        System.out.println("Media dos valores: "+total/ valores.length);
    }

}
