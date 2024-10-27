package Ejercicio;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        String Mensaje;
        int[][] Matriz = new int[4][4];
        int Menor, Mayor, Cantidad;
        Scanner lectura = new Scanner(System.in);
        Menor = 0;
        Mayor = 0;
        Mensaje = "";
        for (int f = 0; f < Matriz.length; f++) {
            for (int c = 0; c < Matriz.length; c++) {
                Random random = new Random();
                Cantidad = random.nextInt(10, 5000);
                if (Menor == 0) Menor = Cantidad;
                else {
                    if (Menor > Cantidad) Menor = Cantidad;
                }
                if (Mayor < Cantidad) {
                    Mayor = Cantidad;
                }
                Mensaje += Cantidad + " ";
            }
            Mensaje += "\n";
        }
        System.out.println(Mensaje);
        System.out.println("La venta mayor es : " + Mayor);
        System.out.println("El venta menor es : " + Menor);
    }
}
