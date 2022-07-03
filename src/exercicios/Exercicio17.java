package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	// Ler 10 números e imprimir quantos são pares e quantos são ímpares.

	public static void main(String[] args) {

		int num, contPar = 0, contImpar = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o primeiro " + i + " ° numero");
			num = entrada.nextInt();

			if (num % 2 == 0) {

				contPar++;

			} else {

				contImpar++;

			}

		}

		System.out.println("\n A quantia de números pares digitados é de: " + contPar);
		System.out.println("\n A quantia de números impares digitados é de: " + contImpar);
	}

}
