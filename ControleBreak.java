public class ControleBreak {
    public static void main(String[] args){
        boolean terminado = false;

        int a=0;
        int b=0;

        while (!terminado){
            a++;
            System.out.println("Indice: "+a);
            if(a==10){
                System.out.println("Indice a:"+a);
                break;
            }
        }

        while (!terminado){
            b++;

            if(b%2 != 0){
                continue;
            }
            System.out.println("Indice: "+b);

            if(b==20){
                break;
            }
        }
    }
}
