package exercicios;

import java.util.Scanner;

public class Exercicio24 {

	/*
	 * Faça um programa que pegue um número do teclado e calcule a soma de todos os
	 * números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
	 * 1+2+3+4+5+6+7=28.
	 */

	public static void main(String[] args) {

		int num, soma = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número : ");
		num = entrada.nextInt();

		do {
			soma += num;
			num--;
		} while (num >= 0);

		System.out.println("O valor da soma total é : " + soma);

	}

}
