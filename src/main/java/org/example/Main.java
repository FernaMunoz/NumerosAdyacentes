package org.example;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int largo =largolista();
    int[] arreglo = crearlista(largo);
    int mayorProducto = productoAdyacentes(arreglo);
    System.out.println("el mayor producto:" + mayorProducto);
    }

    public static int largolista() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros de su lista");
        int largo = scanner.nextInt();
        return largo;
    }

    public static int[] crearlista(int largo) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[largo];

        for (int i = 0; i < largo; i++) {
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    public static int productoAdyacentes(int[] arreglo) {
        int mayorProducto = Integer.MIN_VALUE;
        for (int i=0; i<arreglo.length -1; i++ ){
            int productoActual = arreglo[i] * arreglo [i+1];
            if (productoActual > mayorProducto){
               mayorProducto = productoActual;
            }
        }
         return mayorProducto;  
    }

}