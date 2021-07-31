package Ex_31072021;

public class SecretariaAdm extends Secretaria{
    public SecretariaAdm(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.07;
    }
}
