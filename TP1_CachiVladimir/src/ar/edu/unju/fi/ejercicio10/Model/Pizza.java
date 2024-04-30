package ar.edu.unju.fi.ejercicio10.Model;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final int ADICIONAL_20 = 500;
    private final int ADICIONAL_30 = 750;
    private final int ADICIONAL_40 = 1000;

    // Constructor por defecto
    public Pizza() {
    }

    // Getters y setters
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Método para calcular el precio de la pizza
    public void calcularPrecio() {
        if (diametro == 20) {
            precio = 4500;
            if (ingredientesEspeciales) {
                precio += ADICIONAL_20;
            }
        } else if (diametro == 30) {
            precio = 4800;
            if (ingredientesEspeciales) {
                precio += ADICIONAL_30;
            }
        } else if (diametro == 40) {
            precio = 5500;
            if (ingredientesEspeciales) {
                precio += ADICIONAL_40;
            }
        }
    }

    // Método para calcular el área de la pizza
    public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * radio * radio;
    }
}
