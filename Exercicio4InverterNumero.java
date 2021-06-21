//Desenvolva um programa que solicita ao usuário um número inteiro de no máximo 4 dígitos.
// Inverta esse número.

import java.util.Scanner;

public class Exercicio4InverterNumero {
    public static void main(String[] args){
        System.out.println("Digite um valor até 4 digitos:");
        Scanner n = new Scanner(System.in);
        int numero = n.nextInt();
        while (numero<0 || numero >=9999){
            System.out.println("Digite um valor até 4 digitos:");
            numero = n.nextInt();
        }

        int inv = 0;

        while (numero > 0) {
                inv = 10 * inv + numero % 10;
                numero /= 10;
            }
        System.out.println(inv);
    }
}
