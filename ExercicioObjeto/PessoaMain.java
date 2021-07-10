package ExercicioObjeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaMain {
    public static void main(String[] args) throws ParseException {
        Pessoa pessoa = new Pessoa();
        pessoa.nome="Eder Cabral de Oliveira";
        pessoa.peso=70.0;
        pessoa.altura=1.75;

        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        pessoa.dataNascimento=formato.parse("31/03/1985");

        System.out.println(pessoa.nome+"\n"+pessoa.peso+"\n"+pessoa.altura+"\n"+pessoa.dataNascimento+"\n"+pessoa.getIMC());
    }
    static class Pessoa{
        String nome;
        Date dataNascimento;
        Double peso;
        Double altura;

        double getIMC(){
            return peso/(peso*altura);
        }
    }
}
