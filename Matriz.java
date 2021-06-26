public class Matriz {
    public static void main(String[] args){
        double matriz[][]= new double[4][4];

        for(int i=0; i< matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=i*j;
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("Valor da posicao: ["+i+","+j+"]: "+matriz[i][j]);
            }
        }
    }
}
