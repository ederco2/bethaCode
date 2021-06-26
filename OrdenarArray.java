public class OrdenarArray {
    public static void main(String[] args){
        int [] arrayInteiros={55,27,33,45,92,100,3,8,11,70};
        boolean estOrdenado = false;
        while(!estOrdenado)
        {
            estOrdenado=true;
            for(int i=1;i< arrayInteiros.length;i++){
                if (arrayInteiros[i-1]>arrayInteiros[i]){
                    estOrdenado=false;
                    int aux = arrayInteiros[i];
                    arrayInteiros[i]=arrayInteiros[i-1];
                    arrayInteiros[i-1]=aux;
                    System.out.println("Ordem Atual"+arrayInteiros[0]+" "+arrayInteiros[1]+" "+arrayInteiros[3]+" "+arrayInteiros[4]
                            +" "+arrayInteiros[5]+" "+arrayInteiros[6]+" "+arrayInteiros[7]+" "+arrayInteiros[8]+" "+arrayInteiros[9]);

                }
            }

        }
    }
}
