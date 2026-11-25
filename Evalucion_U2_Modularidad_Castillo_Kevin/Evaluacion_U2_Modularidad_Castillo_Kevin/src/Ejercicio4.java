/*
Nombre: Kevin Castillo
Fecha: 25-11-2026
*/
import java.util.Scanner; 
public class Ejercicio4 {
    public static int leerMinutos(Scanner sc) {
        int minutos;

        do {
            System.out.print("Ingrese los minutos (1-1440): ");
            minutos = sc.nextInt();

            if (minutos < 1 || minutos > 1440) {
                System.out.println("Error: ingrese un valor entre 1 y 1440.");
            }

        } while (minutos < 1 || minutos > 1440);

        return minutos;
    }

    // Calcular las horas cobradas
    public static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;
    }

    // Calcular la tarifa
    public static double tarifa(int horas, char tipo) {
        double precio;

        if (tipo == 'A') {
            precio = 1.00;
        } else {
            precio = 0.50;
        }

        double total = horas * precio;

        // Descuento del 20% si supera 8 horas
        if (horas > 8) {
            total = total * 0.80;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = leerMinutos(sc);

        System.out.print("Tipo de vehículo (A = Auto, M = Moto): ");
        char tipo = Character.toUpperCase(sc.next().charAt(0));

        int horas = horasCobradas(minutos);

        double total = tarifa(horas, tipo);

        System.out.println("Horas cobradas: " + horas);
        System.out.printf("Total a pagar: $%.2f%n", total);

    }
}

