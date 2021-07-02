import java.util.Arrays;
import java.util.Scanner;

//Desenvolva um programa que receba 10 parâmetros, inverta todas as posições e imprima o resultado.
public class Desafio7 {
    public static void main (String[] args){
        String parametros[] = new String[5];
        String valores[]=  new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < parametros.length; i++) {
            System.out.println("Informe um valor:");
            parametros[i]= sc.nextLine();
        }
        System.out.println("Total: "+parametros.length);
        for (int i = parametros.length-1; i >= 0; i--) {
            System.out.println("Valor: "+parametros[i]);
            valores[i]=parametros[parametros.length-i-1];
        }

        for (int i = 0; i < parametros.length; i++) {
            System.out.println("Valor Invertido: "+valores[i]);

        }
    }
}
