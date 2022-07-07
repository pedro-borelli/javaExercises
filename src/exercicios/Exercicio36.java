package exercicios;

import java.util.Scanner;

public class Exercicio36 {

	/*
	 * Escreva um algoritmo para ler 2 valores e se o segundo valor informado for
	 * ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser
	 * aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido
	 * pelo segundo valor lido(Do)
	 */

	public static void main(String[] args) {

		int val1, val2, resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro valor : ");
		val1 = entrada.nextInt();
		

		do {
			System.out.println("Informe o segundo valor : ");
			val2 = entrada.nextInt();

		} while (val2 == 0);

		resultado = val1 / val2;
		System.out.println("O resultado final é  : " + resultado);
	}

}
