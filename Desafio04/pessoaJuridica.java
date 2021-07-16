package Desafio04;

public class pessoaJuridica extends pessoas{
    private String cnpj;
    private String inscricao;
    private String CNAE;

    public pessoaJuridica(Integer id, String nome, String endereco, String telefone, String cnpj, String inscricao, String CNAE) {
        super(id, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricao = inscricao;
        this.CNAE = CNAE;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getCNAE() {
        return CNAE;
    }

    public void setCNAE(String CNAE) {
        this.CNAE = CNAE;
    }
}
