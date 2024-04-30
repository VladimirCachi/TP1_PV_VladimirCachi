package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanoArray;
        do {
            System.out.print("Ingrese un número entero en el rango [5, 10]: ");
            tamanoArray = scanner.nextInt();
        } while (tamanoArray < 5 || tamanoArray > 10);

        String[] nombres = new String[tamanoArray];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
            nombres[i] = scanner.next();
        }

        System.out.println("Valores del array (orden ascendente):");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        System.out.println("Valores del array (orden descendente):");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

    }
}
