package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("\nValores guardados en el array:");
        int contador = 0;
        while (contador < nombres.length) {
            System.out.println("Posición " + contador + ": " + nombres[contador]);
            contador++;
        }

        System.out.println("\nTamaño del array: " + nombres.length);

        byte indiceAEliminar;
        do {
            System.out.print("\nIngrese el índice del elemento a eliminar (0-4): ");
            indiceAEliminar = scanner.nextByte();
        } while (indiceAEliminar < 0 || indiceAEliminar >= nombres.length);

        nombres[indiceAEliminar] = "";

        System.out.println("\nArreglo después de eliminar el elemento:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}