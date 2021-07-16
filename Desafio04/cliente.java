package Desafio04;

public class cliente extends pessoaFisica{
    private Double limiteCretido;
    private Double limiteUtilizado;
    private Double aumento;
    private Double diminui;

    public cliente(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double limiteCretido, Double limiteUtilizado) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.limiteCretido = limiteCretido;
        this.limiteUtilizado = limiteUtilizado;
    }

    public Double getLimiteCretido() {
        return limiteCretido;
    }

    public void setLimiteCretido(Double limiteCretido) {
        this.limiteCretido = limiteCretido;
    }

    public Double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    Double aumentaLimite(Double aumento){
         return limiteCretido+aumento;
    }

    Double  diminuiLimite(Double diminui){
         return limiteCretido+diminui;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "limiteCretido=" + limiteCretido +
                ", limiteUtilizado=" + limiteUtilizado +
                ", aumento=" + aumento +
                ", diminui=" + diminui +
                "} " + super.toString();
    }
}
