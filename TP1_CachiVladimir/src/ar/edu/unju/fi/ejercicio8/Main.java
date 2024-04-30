package ar.edu.unju.fi.ejercicio8;
import ar.edu.unju.fi.ejercicio8.Model.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);       
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();       
        Calculadora calculadora = new Calculadora();
        calculadora.setN(n);    
        System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());      
        System.out.println("La productoria es: " + calculadora.calcularProductoria());

        scanner.close();
	}
}