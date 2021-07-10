package ExercicioObjeto;

public class AnimalMain {
    public static void main(String[]args){
        Animal animal = new Animal();
        animal.nome="Totó";
        animal.peso=3.4;
        animal.altura=0.5;
        animal.som="Au Au";

        animal.somAnimal();
        animal.pular(2.0);
    }
    public static class Animal {
        String nome;
        Double peso;
        Double altura;
        String som;

        void somAnimal() {
            System.out.println(som);
        }

        void pular(Double alturaPulo){
            System.out.println("Altura do pulo:"+alturaPulo);
        }
    }
}

