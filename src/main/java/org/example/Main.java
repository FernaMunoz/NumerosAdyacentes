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
        if (arreglo == null || arreglo.length < 2) {
            throw new IllegalArgumentException("El arreglo debe tener al menos dos elementos y no puede ser cero");
        }
        if (arreglo.length > 20){
            throw new IllegalArgumentException("El largo de la lista no puede exceder las 20 variables, ingrese nuevamente un numero");
        }

        if (arreglo.length <0){
            System.out.println("Error: La longitud de la lista no puede ser un número negativo.");
        }
        for (int largo : arreglo) {
            if (largo > 1000 || largo < -1000) {
                throw new IllegalArgumentException("Los números no deben ser mayores que 1000 o menores que -1000");
            }
        }
        int mayorProducto = Integer.MIN_VALUE;
        for (int i = 0; i < arreglo.length - 1; i++) {
            int productoActual = arreglo[i] * arreglo[i + 1];
            if (productoActual > mayorProducto) {
                mayorProducto = productoActual;
            }
        }
        return mayorProducto;
    }
}
