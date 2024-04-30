package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanoArray;
        do {
            System.out.print("Ingrese un número entero en el rango [3, 10]: ");
            tamanoArray = scanner.nextInt();
        } while (tamanoArray < 3 || tamanoArray > 10);

        int[] numeros = new int[tamanoArray];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Valores del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("Suma de todos los valores del array: " + suma);

    }
}