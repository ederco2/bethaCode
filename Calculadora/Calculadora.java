package Calculadora;

public class Calculadora {
    public static void main(String[] args) {
    calculadoraMain calculadora = new calculadoraMain();



        System.out.println(
                calculadora.calcular(1.0,2.0)
        );
        System.out.println(
                calculadora.calcular("1.0","2.0")
        );
    }

}
