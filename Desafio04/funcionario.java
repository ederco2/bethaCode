package Desafio04;

public class funcionario extends pessoaFisica{
    private Double salarioBruto;
    private Double salarioLiquido;

    public funcionario(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double salarioBruto, Double salarioLiquido) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
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

    public void getAumento(Double aumento){
        this.salarioBruto += aumento;
    }

    @Override
    public String toString() {
        return "funcionario{" +
                "salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                "} " + super.toString();
    }
}
