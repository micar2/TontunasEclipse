
import java.util.Scanner;

public class AE3_2 {
	static Scanner teclado = new Scanner(System.in);
	static int LIMITE_SUPERIOR = 10, LIMITE_INFERIOR = -10, CARACTER_BASE = 0, contador;

	public static void main(String[] args) {

		generarBarraHorizontal(9);
		generarBarraHorizontal(-2);
		generarBarraHorizontal(4);
		generarBarraHorizontal(-6);
		generarBarraHorizontal(-10);
		generarBarraHorizontal(0);
		generarBarraHorizontal(10);
		generarBarraHorizontal(-11);
		generarBarraHorizontal(11);

	}

	private static void generarBarraHorizontal(int CARACTER_BASE) {
		System.out.print(CARACTER_BASE + "\t"); // numera las filas y deja los
												// espacios igualados
		contador = LIMITE_INFERIOR; // para que el contador empiece desde -10 y
									// si no cumple te lo comunica
		if (CARACTER_BASE >= LIMITE_INFERIOR && CARACTER_BASE <= LIMITE_SUPERIOR) { // para
																					// todo
																					// caracter
																					// base
																					// entre
																					// -10
																					// y
																					// 10

			while (contador <= LIMITE_SUPERIOR) { // hasta que el contador no
													// llegue a 10 sigue
													// realizandose

				if (contador < 0) {// seleccionamos la parte a la izquierda de
									// la barra
					if (contador < CARACTER_BASE) {// pone espacios hasta llegar
													// al valor y a partir de
													// ahí *
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				if (contador == 0) {// pone la barra separadora en el 0
					System.out.print("|");
				}
				if (contador > 0) {// seleccionamos la parte derecha de la barra
					if (contador <= CARACTER_BASE) {// mete * hasta llegar al
													// valor(este incluido) y
													// pasado este espacios
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				contador++;// para contar el numero de veces que se ejecuta
			}
		} else {
			System.out.print("FUERA DE RANGO");
		}
		System.out.println();// para que salte un espacio cada vez que termina
								// el metodo

	}

}
