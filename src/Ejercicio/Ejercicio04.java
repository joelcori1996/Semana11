package Ejercicio;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio04 {

    public static void main(String[] args) {
        String Mensaje;
        int[][] Matriz = new int[3][3];
        int Sum, Pro, Cantidad;
        Scanner lectura = new Scanner(System.in);
        Sum = 0;
        Mensaje = "";
        for (int f = 0; f < Matriz.length; f++) {
            for (int c = 0; c < Matriz.length; c++) {
                Random random = new Random();
                Cantidad = random.nextInt(1000, 10000);
                Sum = Sum + Cantidad;
                Mensaje += Cantidad + " ";
            }
            Mensaje += "\n";
        }
        Pro = Sum / (Matriz.length * Matriz.length);
        System.out.println(Mensaje);
        System.out.println("Total de ventas es: " + Sum);
        System.out.println("El promedio ventas es : " + Pro);
    }
}
