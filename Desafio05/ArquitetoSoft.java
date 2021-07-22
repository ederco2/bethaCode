package Desafio05;

public class ArquitetoSoft extends Funcionario{
    public ArquitetoSoft(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    @Override
    public Double getSalarioBruto() {
        return getSalarioBruto()+getSalarioBruto()*0.15;
    }

    @Override
    public String toString() {
        return "ArquitetoSoft{} " + super.toString();
    }
}
