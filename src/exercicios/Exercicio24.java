package exercicios;

import java.util.Scanner;

public class Exercicio24 {

	/*
	 * Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os
	 * n�meros de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois
	 * 1+2+3+4+5+6+7=28.
	 */

	public static void main(String[] args) {

		int num, soma = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero : ");
		num = entrada.nextInt();

		do {
			soma += num;
			num--;
		} while (num >= 0);

		System.out.println("O valor da soma total � : " + soma);

	}

}
