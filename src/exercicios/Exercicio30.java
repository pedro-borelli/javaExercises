package exercicios;

import java.util.Scanner;

public class Exercicio30 {

	/*
	 * Ler um valor e escrever "O VALOR É MAIOR QUE 10", caso o valor informado seja
	 * maior que 10, caso contrário informar "VALOR MENOR QUE 10"
	 */

	public static void main(String[] args) {

		int valor;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um valor : ");
		valor = entrada.nextInt();

		if (valor > 10) {
			System.out.println("Valor maior que 10");
		} else {
			System.out.println("Valor menor que 10");
		}

	}

}
