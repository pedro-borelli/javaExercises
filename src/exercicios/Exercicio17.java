package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

	public static void main(String[] args) {

		int num, contPar = 0, contImpar = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o primeiro " + i + " � numero");
			num = entrada.nextInt();

			if (num % 2 == 0) {

				contPar++;

			} else {

				contImpar++;

			}

		}

		System.out.println("\n A quantia de n�meros pares digitados � de: " + contPar);
		System.out.println("\n A quantia de n�meros impares digitados � de: " + contImpar);
	}

}
