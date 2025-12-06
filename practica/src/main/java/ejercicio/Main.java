package ejercicio;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String opcion = "";

        System.out.println("Bienvenido a un programa de Metodos de Ordenamiento.");
        System.out.println("Que tan grande quieres que sea el arreglo?");
        int[] arreglo = new int[sc.nextInt()];
        for(int i = 0; i < arreglo.length; i++){ // Array full
            System.out.println("Introduce el valor del arreglo " + (i + 1));
            arreglo[i] = sc.nextInt();
        }
        sc.nextLine();

        do{

            System.out.println("Que desea hacer?");
            System.out.println("1. Ordenamiento de un arreglo de menor a mayor.");
            System.out.println("2. Ordenamiento de un arreglo de mayor a menor.");
            System.out.println("3. Ordenamiento de un arreglo (par al inicio e impares al final) menor a mayor");
            String tipo;
            do{
                tipo = sc.nextLine();
                switch(tipo){
                    case "1":

                        System.out.println("Tu arreglo ordenado seria... " + (Arrays.toString(menorAMayor(arreglo)))); // Print the array
                        break;
                    case "2":
                        System.out.println("Tu arreglo ordenado seria... " + (Arrays.toString(mayorAMenor(arreglo)))); // Print the array
                        break;
                    case "3":
                        System.out.println("Tu arreglo ordenado seria... " + (Arrays.toString(parEImpar(arreglo)))); // Print the array
                        break;
                    default:
                        System.out.println("Opción inválida, vuelve a intentar.");

                }
            }while (!tipo.equals("1") && !tipo.equals("2") && !tipo.equals("3"));

            do {
                System.out.println("¿Quieres hacer otra cosa? (si/no)");
                opcion = sc.nextLine().toLowerCase();

                if (!opcion.equals("si") && !opcion.equals("no")) {
                    System.out.println("Opción inválida, por favor coloca una opción válida");
                }

            } while (!opcion.equals("si") && !opcion.equals("no"));

        }while(opcion.equals("si"));

    }

    public static int[] menorAMayor (int[] arregloN){ 
        for(int i = 0; i < arregloN.length; i++){ 
            for(int j = 0; j < arregloN.length; j++){ // Nested loop to compare each element
                if(arregloN[j] > arregloN[i]){ // If the current element is greater than the next element
                    int temp = arregloN[j]; // Swap the elements
                    arregloN[j] = arregloN[i]; // using a temporary variable
                    arregloN[i] = temp; // complete the swap
                }
            }
        }
        return arregloN;
    }
    public static int[] mayorAMenor (int[] arregloN){ 
        for(int i = 0; i < arregloN.length; i++){
            for(int j = 0; j < arregloN.length; j++){ // Nested loop to compare each element
                if(arregloN[j] < arregloN[i]){ // If the current element is less than the next element
                    int temp = arregloN[j]; // Swap the elements
                    arregloN[j] = arregloN[i]; // using a temporary variable
                    arregloN[i] = temp; // complete the swap
                }
            }
        }
        return arregloN;
    }
    public static int[] parEImpar(int[] arreglo){
        int[] arregloOrdenado = new int[arreglo.length]; // New array to store the ordered elements
        int[] arregloPar = pares(arreglo); // Get the even numbers
        int[] arregloImpar = impares(arreglo); // Get the odd numbers

        for (int i = 0; i < arregloPar.length ; i++) {
            arregloOrdenado[i] = arregloPar[i]; // Fill the new array with even numbers first
        }
        for (int i = 0; i < arregloImpar.length ; i++) {
            arregloOrdenado[i + arregloPar.length] = arregloImpar[i]; // Then fill with odd numbers
        }
        return arregloOrdenado;
    }

    public static int[] pares(int[] arreglo){
        int acum = 0;
        for (int i = 0; i < arreglo.length ; i++){
            if(arreglo[i] % 2 == 0){ // Check if the number is even
                acum ++;
            }
        }

        int[] pares = new int[acum];
        int par = 0;
        for (int i = 0; i <arreglo.length ; i++){
            if(arreglo[i] % 2 == 0){ // Check if the number is even
                pares[par] = arreglo[i]; // Add to the even array
                par++;
            }
        }
        pares = menorAMayor(pares);
        return pares;
    }
    public static int[] impares(int[] arreglo){
        int acum = 0;
        for (int i = 0; i < arreglo.length ; i++){ 
            if(arreglo[i] % 2 != 0){ // Check if the number is odd
                acum ++;
            }
        }

        int[] impares = new int[acum];
        int impar = 0;
        for (int i = 0; i <arreglo.length ; i++){
            if(arreglo[i] % 2 != 0){ // Check if the number is odd
                impares[impar] = arreglo[i]; // Add to the odd array
                impar++;
            }
        }
        impares = menorAMayor(impares);
        return impares;
    }
}