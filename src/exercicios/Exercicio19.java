package exercicios;

import java.util.Scanner;

public class Exercicio19 {
	/*
	 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
	 * igual a zero. No final, mostre a soma dos n�meros digitados
	 */

	public static void main(String[] args) {
		
		int num, soma = 0;

		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um n�mero : ");
			num = entrada.nextInt();
			soma = num + soma;
			
			
		} while(num != 0);
		
		System.out.printf("A soma total dos valores digitados � de : " + soma);

	}

}
