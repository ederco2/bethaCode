package Ex_31072021;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Eder");
        gerente.setSalario(1500.00);
        System.out.println(gerente.getBonificacao());

        Funcionario presidente = new Presidente("Josi");
        Funcionario diretor = new Diretor("Salete");
        }
    }

