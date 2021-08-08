import javax.swing.*;
import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso: ");
        int peso = sc.nextInt();

        System.out.println("Informe a altura: ");
        int altura = sc.nextInt();

        int IMC = (altura * altura)/peso;


        String mensagem ="IMC: "+IMC;
        System.out.println("abrindo..."+IMC);
        JOptionPane.showMessageDialog(null,mensagem);
    }
}


