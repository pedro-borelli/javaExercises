package exercicios;

import java.util.Scanner;

public class Exercicio37 {
	/*
	 * Acrescentar uma mensagem de valor inv�lido no exerc�cio, caso o segundo
	 * valor informado seja 0.
	 */

	public static void main(String[] args) {
		int val1, val2, resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro valor : ");
		val1 = entrada.nextInt();

		do {
			System.out.println("Informe o segundo valor : ");
			val2 = entrada.nextInt();
			System.out.println("VALOR INV�LIDO");

		} while (val2 == 0);

		resultado = val1 / val2;
		System.out.println("O resultado final �  : " + resultado);

	}

}
