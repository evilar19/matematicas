package proyectoMatematicas.juegos;

import java.util.Random;

import proyectoMatematicas.Utilidades;

public abstract class Juegos implements Jugable{

	public void MayorMenorIgual() {

		boolean continua = true;// variable para saber si desea jugar de nuevo o
								// no
		boolean pasa = true; // variable utilizada para saber si pasa de nivel o
								// no
		int aciertos = 0;// numero de aciertos
		int nivel = 1;// nivel en el que se encuentra el jugador

		System.out.println("Bienvenido al juego matematico educativo");
		System.out
				.println("¡¡¡PORQUE LAS MATES NO TIENEN QUE SER ABURRIDAS!!!");

		do {
			for (int i = 0; i < 10; i++) {
				System.out.println("NIVEL " + nivel);
				System.out.println("Se muestran dos numeros");
				double numero = Math.pow(nivel, 10);
				Random randomGenerator = new Random();
				double randomInt = randomGenerator.nextInt((int) numero);
				double randomInt2 = randomGenerator.nextInt((int) numero);
				System.out.println("A." + randomInt);
				System.out.println("B." + randomInt2);

				System.out.println("¿Como son los siguientes numeros? ");
				System.out.println("1. A>B");
				System.out.println("2. A<B");
				System.out.println("3. A=B");

				System.out.println("Introduce tu respuesta");
				int opcion = Utilidades.leerEntero();

				switch (opcion) {
				case 1:
					if (randomInt > randomInt2) {
						pasa = true;
					} else
						pasa = false;

				case 2:
					if (randomInt < randomInt2) {
						pasa = true;
					} else
						pasa = false;
				case 3:
					if (randomInt == randomInt2) {
						pasa = true;
					} else
						pasa = false;

				}

				if (pasa) {
					System.out
							.println("Enhorabuena tu respuesta es correcta pasas");
					aciertos++;
				} else {
					System.out.println("Lo siente respuesta incorrecta");

				}
			}
			if (aciertos > 5) {
				System.out.println("Enhorabuena a pasado al siguiente nivel");
				nivel++;
			} else
				System.out.println("Lo siento no ha pasado el juego ");
			System.out.println("¿Desea continuar?");
			System.out.println("¿S/N?");
			char respuesta = Utilidades.leerCaracter();
			if (respuesta == 'S') {
				continua = true;
				nivel = 1;
			} else
				continua = false;

		} while ((continua || nivel < 3));

	}

}
