package Desafio04;

public class pessoas {
    private Integer id;
    private String endereco;
    private String telefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public pessoas(Integer id, String endereco, String telefone) {
        this.id = id;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
