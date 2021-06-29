//import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;

//Faça um programa que receba entrada de dados  e informe ao usuário através de uma caixa de diálogo qual foi o dados passados.
public class Desafio6 {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Mensagem obrigatoria para funcionar.");
        System.out.print("Digite :");

        String dado1 = s.nextLine();
        System.out.print("---------------");

        JOptionPane.showMessageDialog(null,dado1);
    }
}
