package ar.edu.unju.fi.ejercicio12;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import ar.edu.unju.fi.ejercicio12.Model.Persona;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (formato dd/mm/aaaa):");
        String fechaNacimientoStr = scanner.nextLine();
        String[] fechaNacimientoArray = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(fechaNacimientoArray[0]);
        int mes = Integer.parseInt(fechaNacimientoArray[1]) - 1; // Restamos 1 porque los meses en Calendar van de 0 a 11
        int anio = Integer.parseInt(fechaNacimientoArray[2]);
        Calendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);

        Persona persona = new Persona(nombre, fechaNacimiento);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio); // Sumamos 1 al mes porque enero es 0
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
        System.out.println("Estación: " + persona.determinarEstacion());

        scanner.close();
    }
}
