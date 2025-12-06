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

        public static int[] pares(int[] arreglo){
        int acum = 0;
        for (int i = 0; i < arreglo.length - 1; i++){
            if(arreglo[i] % 2 == 0){
                acum ++;
            }
        }

        int[] pares = new int[acum];
        int par = 0;
        for (int i = 0; i <arreglo.length - 1; i++){
            if(arreglo[i] % 2 == 0){
                pares[par] = arreglo[i];
                par++;
            }
        }
        pares = menorAMayor(pares);
        return pares;
    }

    public static int[] impares(int[] arreglo){
        int acum = 0;
        for (int i = 0; i < arreglo.length - 1; i++){
            if(arreglo[i] % 2 != 0){
                acum ++;
            }
        }

        int[] impares = new int[acum];
        int impar = 0;
        for (int i = 0; i <arreglo.length - 1; i++){
            if(arreglo[i] % 2 != 0){
                impares[impar] = arreglo[i];
                impar++;
            }
        }
        impares = menorAMayor(impares);
        return impares;
    }
}