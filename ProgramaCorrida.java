public class ProgramaCorrida {
    public static void main(String[] arg) {
        carrroCOrrida carroEquipeVelocidade = new carrroCOrrida();
        carrroCOrrida carroEquipeTrapaceiro = new carrroCOrrida();

        Piloto pilotoEquipeVelocidade= new Piloto();
        Piloto pilotoEquipeTRapaceiro = new Piloto();

        pilotoEquipeVelocidade.nomePiloto = "Piloto 1";
        pilotoEquipeVelocidade.idadePiloto=25;
        pilotoEquipeVelocidade.habilidadePiloto=75;

        pilotoEquipeTRapaceiro.nomePiloto="`Piloto2";
        pilotoEquipeTRapaceiro.idadePiloto=27;
        pilotoEquipeTRapaceiro.habilidadePiloto=65;

        carroEquipeVelocidade.piloto=pilotoEquipeVelocidade;
        carroEquipeTrapaceiro.piloto=pilotoEquipeTRapaceiro;

        carroEquipeVelocidade.numeroIdentificacao=1;
        carroEquipeTrapaceiro.numeroIdentificacao=2;

        carroEquipeVelocidade.ligar();
        carroEquipeTrapaceiro.ligar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiro.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiro.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiro.velocidadeAtual=200.0;

        System.out.println("Equipe Velocidade: "+carroEquipeVelocidade.velocidadeAtual);
        System.out.println("Equipe Trapaceiro: "+carroEquipeTrapaceiro.velocidadeAtual);

    }

    static class Piloto{
        String nomePiloto;
        Integer idadePiloto;
        Integer habilidadePiloto;
    }

    static class carrroCOrrida {
        Integer numeroIdentificacao;
        Double velocidadeAtual=0.0;
        Double velocidadeMAxima=100.0;
        Piloto piloto;

        void ligar() {
            System.out.println("Vrummmm.");
        }

        void desligar() {
            System.out.println("Mmmmmmmm");
        }

        void acelerar() {
            velocidadeAtual += 10 + piloto.habilidadePiloto*0.1;
            if (velocidadeAtual > velocidadeMAxima) {
                velocidadeAtual = velocidadeMAxima;
            }
        }


        void frear(Integer itensidadeFreada) {
            if(itensidadeFreada >100){
                itensidadeFreada=100;
            }else if(itensidadeFreada <0){
                itensidadeFreada=0;
            }
            velocidadeAtual-=itensidadeFreada*0.25;

            if(velocidadeAtual <0){
                velocidadeAtual=0.0;
            }
        }

    }

}
