package exercicios;

import java.util.Scanner;

public class Exercicio18 {

	// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos
	// de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	// idade for = -99.

	public static void main(String[] args) {

		int idade, menos21 = 0, mais50 = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade : ");
		idade = entrada.nextInt();

		while (idade != -99) {

			if (idade < 21) {
				menos21++;
			}
			if (idade > 50) {
				mais50++;
			}

			System.out.println("Digite sua idade : ");
			idade = entrada.nextInt();

		}
		
		System.out.printf("\nO total de pessoas com menos de 21 anos é " + menos21);
		System.out.printf("\nO total de pessoas com mais de 50 anos é " + mais50); 

	}

}
