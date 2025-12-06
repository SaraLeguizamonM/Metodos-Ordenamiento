package ejercicio;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] menorAMayor (int[] arregloN){
        for(int i = 0; i < arregloN.length - 1; i++){
            for(int j = 0; j < arregloN.length - 1 - i; i++){
                if(arregloN[j] > arregloN[j + 1]){
                    int temp = arregloN[j];
                    arregloN[j] = arregloN[j + 1];
                    arregloN[j + 1] = temp;
                }
            }
        }
        return arregloN;
    }

    public static int[] mayorAMenor (int[] arregloN){
        for(int i = 0; i < arregloN.length - 1; i++){
            for(int j = 0; j < arregloN.length - 1 - i; i++){
                if(arregloN[j] < arregloN[j + 1]){
                    int temp = arregloN[j];
                    arregloN[j] = arregloN[j + 1];
                    arregloN[j + 1] = temp;
                }
            }
        }
        return arregloN;
    }
}