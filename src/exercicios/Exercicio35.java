package exercicios;

import java.util.Scanner;

public class Exercicio35 {

	/*
	 * Escrever um algorítmo para ler 2 valores e se o segundo valor informado for
	 * 0, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser
	 * aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido
	 * pelo segundo valor lido. (While)
	 */

	public static void main(String[] args) {

		int val1, val2, divisao;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o primeiro valor : ");
		val1 = entrada.nextInt();
		System.out.println("Informe o segundo valor : ");
		val2 = entrada.nextInt();
		while (val2 == 0) {
			System.out.println("Informe um novo valor : ");
			val2 = entrada.nextInt();
		}
		divisao = val1 / val2;
		System.out.println("O resultado da divisão é : " + divisao);

	}

}
