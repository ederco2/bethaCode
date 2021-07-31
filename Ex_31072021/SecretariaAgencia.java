package Ex_31072021;

public class SecretariaAgencia extends  Secretaria{
    public SecretariaAgencia(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.05;
    }
}
