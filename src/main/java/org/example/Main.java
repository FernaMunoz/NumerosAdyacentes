package org.example;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {
        int largo = largoLista();
        ArrayList<Integer> lista = ingresarDatosLista(largo);
        }
    public static int largoLista(){
        Scanner Scan = new Scanner(System.in);
        int largo, ingresos;
        System.out.println("ingrese el largo de su lista, este debe estar entre el 2 y el 20");
        largo = Scan.nextInt();
        return largo;
    }
    public static ArrayList<Integer> ingresarDatosLista(int largo) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        for (int i = 0; i < largo; i++) {
            Scanner agregar = new Scanner(System.in);
            int NumeroAgregar = agregar.nextInt();
            listaNumeros.add(NumeroAgregar);
            System.out.print(listaNumeros);

        }
        return listaNumeros;
    }
        public static ArrayList<Integer> Multiplicar (ArrayList<Integer> listaNumeros){
        System.out.print(listaNumeros);
        return listaNumeros;

    }


    }

