package MatriculaMain;

public class Matricula {
    private Double Salario;
    private String TipoMatricula;

    public Matricula(){
        setTipoMatricula("nulo");
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public String getTipoMatricula() {
        return TipoMatricula;
    }

    public void setTipoMatricula(String tipoMatricula) {
        TipoMatricula = tipoMatricula;
    }
}
