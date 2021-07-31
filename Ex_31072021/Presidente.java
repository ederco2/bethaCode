package Ex_31072021;

public class Presidente extends  Funcionario{

    public Presidente(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.10;
    }
}
