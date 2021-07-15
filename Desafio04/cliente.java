package Desafio04;

public class cliente extends pessoaFisica{
    private Double limiteCretido;
    private Double limiteUtilizado;


    public cliente(Integer id, String endereco, String telefone, Character cpf, Character rg, Character sexo) {
        super(id, endereco, telefone, cpf, rg, sexo);
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

    double aumentaLimite(Double aumento){
        return limiteCretido+aumento;
    }
    double diminuiLimite(Double diminui){
        return limiteCretido+diminui;
    }

}
