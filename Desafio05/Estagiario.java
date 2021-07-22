package Desafio05;

public class Estagiario extends Funcionario{
    public Estagiario(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto()+super.getSalarioBruto()*0.05;
    }

    @Override
    public String toString() {
        return "Estagiario{} " + super.toString();
    }
}
