import java.util.Scanner;

public class ProductoAdyacentes {
    public static int productoAdyacentes(int[] arreglo) {
        int maxnumero = Integer.MIN_VALUE;

        for (int i = 0; i < arreglo.length - 1; i++) {
            int producto = arreglo[i] * arreglo[i + 1];
            if (producto > maxnumero) {
                maxnumero = producto;
            }
        }
        return maxnumero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el largo de la lista de numeros: ");
        int largo = scanner.nextInt();

        int[] arreglo = new int[largo];

        System.out.println("Ingrese los numeros de la lista:");
        for (int i = 0; i < largo; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        scanner.close();

        int resultado = productoAdyacentes(arreglo);
        System.out.println("El producto adyacente es: " + resultado);
    }
}