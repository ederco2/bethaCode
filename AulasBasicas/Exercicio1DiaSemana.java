
import java.util.Scanner;

public class Exercicio1DiaSemana {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um dia da semana: ");

        int semana;
        for(semana = s.nextInt(); semana <= 0 || semana > 7; semana = s.nextInt()) {
            System.out.println("Informe um numero entre 1 e 7");
        }

        switch(semana) {
            case 1:
                System.out.println("Segunda Feira");
                break;
            case 2:
                System.out.println("Terca Feira");
                break;
            case 3:
                System.out.println("Quarta Feira");
                break;
            case 4:
                System.out.println("Quinta Feira");
                break;
            case 5:
                System.out.println("Sexta Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
        }

    }
}
