package Ex_31072021;

public class Diretor extends Funcionario{

    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.20;
    }
}
