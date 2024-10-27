package Ejercicio;
import java.util.Scanner;
public class Ejercicio01 {

    public static void main(String[] args) {
        String Mensaje;
        int[][] Matriz = new int[4][4];
        int sum, Cantidad;
        Scanner lectura = new Scanner(System.in);
        sum = 0;
        Mensaje = "";
        for (int f = 0; f < Matriz.length; f++) {
            for (int c = 0; c < Matriz.length; c++) {
                System.out.print("Ingrese ventas : ");
                Cantidad = lectura.nextInt();
                sum = sum + Cantidad;

                Mensaje += Cantidad + " ";
            }
            Mensaje += "\n";

        }
        System.out.println(Mensaje);
        System.out.println("El total de ventas es : " + sum);
    }
}
