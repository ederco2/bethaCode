package Desafio04;

public class pessoaFisica  extends pessoas{
    private Character cpf;
    private Character rg;
    private Character sexo;

    public Character getCpf() {
        return cpf;
    }

    public void setCpf(Character cpf) {
        this.cpf = cpf;
    }

    public Character getRg() {
        return rg;
    }

    public void setRg(Character rg) {
        this.rg = rg;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public pessoaFisica(Integer id, String endereco, String telefone, Character cpf, Character rg, Character sexo) {
        super(id, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }
}
