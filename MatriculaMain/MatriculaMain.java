package MatriculaMain;

public class MatriculaMain {

    public static class MatriculaBuilder {
        public static Matricula criaMatricula(String tipo) {
            if (tipo.equals("FUNCIONARIO")) {
                return new Funcionario();
            } else {
                return new Estagiario();
            }
        }
    }

    public static void main(String[] args) {
        Matricula matricula = MatriculaBuilder.criaMatricula("FUNCIONARIO");

    }
}
