package Ejercicio;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        String Mensaje;
        int[][] Matriz = new int[4][4];
        int sum, pro, Cantidad;
        Scanner lectura = new Scanner(System.in);
        sum = 0;
        pro = 0;
        Mensaje = "";
        for (int f = 0; f < Matriz.length; f++) {
            for (int c = 0; c < Matriz.length; c++) {
                System.out.print("Ingrese compra : ");
                Cantidad = lectura.nextInt();
                sum = sum + Cantidad;
                Mensaje += Cantidad + " ";
            }
            Mensaje += "\n";
        }
        pro = sum / (Matriz.length * Matriz.length);
        System.out.println(Mensaje);
        System.out.println("Suma de compras  : " + sum);
        System.out.println("Promedio de las compras : " + pro);
    }
}
