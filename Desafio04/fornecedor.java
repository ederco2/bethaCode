package Desafio04;

public class fornecedor extends pessoaJuridica{
    private String responsavel;
    private  String observacao;

    public fornecedor(Integer id, String nome, String endereco, String telefone, String cnpj, String inscricao, String CNAE, String responsavel, String observacao) {
        super(id, nome, endereco, telefone, cnpj, inscricao, CNAE);
        this.responsavel = responsavel;
        this.observacao = observacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
