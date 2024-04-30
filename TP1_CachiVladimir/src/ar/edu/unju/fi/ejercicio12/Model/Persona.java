package ar.edu.unju.fi.ejercicio12.Model;
import java.util.Calendar;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        Calendar ahora = Calendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (ahora.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public String determinarSignoZodiaco() {
        int mes = fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        if ((mes == Calendar.MARCH && dia >= 21) || (mes == Calendar.APRIL && dia <= 19)) {
            return "Aries";
        } else if ((mes == Calendar.APRIL && dia >= 20) || (mes == Calendar.MAY && dia <= 20)) {
            return "Tauro";
        } else if ((mes == Calendar.MAY && dia >= 21) || (mes == Calendar.JUNE && dia <= 20)) {
            return "Géminis";
        } else if ((mes == Calendar.JUNE && dia >= 21) || (mes == Calendar.JULY && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == Calendar.JULY && dia >= 23) || (mes == Calendar.AUGUST && dia <= 22)) {
            return "Leo";
        } else if ((mes == Calendar.AUGUST && dia >= 23) || (mes == Calendar.SEPTEMBER && dia <= 22)) {
            return "Virgo";
        } else if ((mes == Calendar.SEPTEMBER && dia >= 23) || (mes == Calendar.OCTOBER && dia <= 22)) {
            return "Libra";
        } else if ((mes == Calendar.OCTOBER && dia >= 23) || (mes == Calendar.NOVEMBER && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == Calendar.NOVEMBER && dia >= 22) || (mes == Calendar.DECEMBER && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == Calendar.DECEMBER && dia >= 22) || (mes == Calendar.JANUARY && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == Calendar.JANUARY && dia >= 20) || (mes == Calendar.FEBRUARY && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    public String determinarEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH);

        if (mes >= Calendar.MARCH && mes <= Calendar.MAY) {
            return "Primavera";
        } else if (mes >= Calendar.JUNE && mes <= Calendar.AUGUST) {
            return "Verano";
        } else if (mes >= Calendar.SEPTEMBER && mes <= Calendar.NOVEMBER) {
            return "Otoño";
        } else {
            return "Invierno";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
}
