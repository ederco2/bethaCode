//Implemente um programa para calcular a área de um trapézio,
// onde: h = altura b = base menor B = base maior Área = (h.(b+B))/2

import java.util.Scanner;

public class Exercicio5Trapezio {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Digite a altura:");
        int altura = n.nextInt();
        System.out.println("Digite a base menor:");
        int baseMenor = n.nextInt();
        System.out.println("Digite a base Maior:");
        int baseMaior = n.nextInt();

        int area = (altura*(baseMenor+baseMaior)) / 2 ;
        System.out.println("A area do trapezio: "+area);
    }
}
