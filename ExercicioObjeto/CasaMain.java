package ExercicioObjeto;

public class CasaMain {

    public static void main(String[] args) {
        casa casa = new casa("rua afonso celso,182",3.0,6.0,130.0,3);

        System.out.println(casa);
    }
      public static class casa{
           private String endereco;
           private Double numeroSala;
           private Double  numeroquarto;
           private Double metroQuadrado;
           private Integer numeroBanheiro;

           public casa(String endereco, Double numeroSala, Double numeroquarto, Double metroQuadrado,Integer numeroBanheiro) {
               this.endereco = endereco;
               this.numeroSala = numeroSala;
               this.numeroquarto = numeroquarto;
               this.metroQuadrado = metroQuadrado;
               this.numeroBanheiro = numeroBanheiro;
           }

           public String getEndereco() {
               return endereco;
           }

           public Double getNumeroSala() {
               return numeroSala;
           }

           public Double getNumeroquarto() {
               return numeroquarto;
           }

           public Double getMetroQuadrado() {
               return metroQuadrado;
           }

           public void setEndereco(String endereco) {
               this.endereco = endereco;
           }

           public void setNumeroSala(Double numeroSala) {
               this.numeroSala = numeroSala;
           }

           public void setNumeroquarto(Double numeroquarto) {
               this.numeroquarto = numeroquarto;
           }

           public void setMetroQuadrado(Double metroQuadrado) {
               this.metroQuadrado = metroQuadrado;
           }

           public Integer getNumeroBanheiro() {
               return numeroBanheiro;
           }

           public void setNumeroBanheiro(Integer numeroBanheiro) {
               this.numeroBanheiro = numeroBanheiro;
           }

           @Override
           public String toString() {
               return "casa{" +
                       "endereco='" + endereco + '\'' +
                       ", numeroSala=" + numeroSala +
                       ", numeroquarto=" + numeroquarto +
                       ", metroQuadrado=" + metroQuadrado +
                       ", numeroBanheiro=" + numeroBanheiro +
                       '}';
           }
       }

}
