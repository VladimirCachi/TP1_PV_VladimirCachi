package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		int i = 2;
        int j = 40;

        for (; j >= 0; j -= 4, i += 5) {
            System.out.print((j + i) + " ");
        }
	}

}
