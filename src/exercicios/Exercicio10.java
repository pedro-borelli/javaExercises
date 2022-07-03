package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		float indice;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o índice de poluição : ");
		indice = entrada.nextFloat();

		if (indice >= 0.3) {
			System.out.println("As atividades do  GRUPO 1 devem ser suspendidas....");
		}

		else if (indice >= 0.4) {
			System.out.println("As atividades do  GRUPO 1 e GRUPO 2 devem ser suspendidas....");
		}

		else if (indice >= 0.5) {
			System.out.println("As atividades do  GRUPO 1, do  GRUPO 2 e GRUPO 3 devem ser suspendidas....");
			
		} else {

			System.out.println("Índice de poluição estável!");

		}
	}

}
