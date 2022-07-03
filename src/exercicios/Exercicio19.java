package exercicios;

import java.util.Scanner;

public class Exercicio19 {
	/*
	 * Crie um programa que leia um número do teclado até que encontre um número
	 * igual a zero. No final, mostre a soma dos números digitados
	 */

	public static void main(String[] args) {
		
		int num, soma = 0;

		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número : ");
			num = entrada.nextInt();
			soma = num + soma;
			
			
		} while(num != 0);
		
		System.out.printf("A soma total dos valores digitados é de : " + soma);

	}

}
