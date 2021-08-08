public class OrientacaoMain {
    public static void main(String[] args){
        Documento documento1;

        documento1 = new Documento();

        documento1.codigo =12345;
        documento1.nome="Alfredo";
        documento1.foto="foto1.jpg";
        documento1.DataNascimento="20/02/2021";

        System.out.println("Codigo do documento: "+documento1.codigo);

    }

     static class Documento{
        String foto;
        String nome;
        Integer codigo;
        String DataNascimento;
    }

}

