package Desafio05;

public class Analista extends Funcionario{
    public Analista(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto()+super.getSalarioBruto()*0.10;
    }

    @Override
    public String toString() {
        return "Analista{} " + super.toString();
    }
}
