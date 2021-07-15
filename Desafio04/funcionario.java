package Desafio04;

public class funcionario extends pessoaFisica{
    private Double salarioBruto;
    private Double salarioLiquido;

    public funcionario(Integer id, String endereco, String telefone, Character cpf, Character rg, Character sexo, Double salarioBruto, Double salarioLiquido) {
        super(id, endereco, telefone, cpf, rg, sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
}
