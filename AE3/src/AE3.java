import java.util.Scanner;

public class AE3 {
	static Scanner teclado = new Scanner(System.in);
	static int LIMITE_SUPERIO = 11, LIMITE_INERIOR = -11, CARACTER_BASE = 0, contador;

	public static void main(String[] args) {

		System.out.println("Introduce numeros entre el -10 y el 10");

		generarBarraHorizontal();
	}

	private static void generarBarraHorizontal() {
		CARACTER_BASE = teclado.nextInt();
		for (contador = -10; CARACTER_BASE < 11; contador++) {

			if (CARACTER_BASE < 0) {
				if (contador < CARACTER_BASE) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if (contador == 0) {
				System.out.print("|");
			}
			if (CARACTER_BASE > 0) {
				if (contador <= CARACTER_BASE) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

		}

	}

}
