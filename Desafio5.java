import java.util.Arrays;

//Faça um programa que inverta as posições de um array com 10 elementos.
public class Desafio5 {
    public static void main(String[] args){
        int[] elementos = {3,6,1,8,44,36,66,77,88,99};

        int ordem[]=new int[10];

        for (int i = 9; i >= 0; i--) {
            ordem[i]= elementos[i];
            //System.out.println(i);
        }
        for (int i = 0; i <=9; i++) {
            elementos[i]= ordem[elementos.length-i-1];
            System.out.println("Ordenado: "+i+" :"+elementos[i]);
        }
    }
}
