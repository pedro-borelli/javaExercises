package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int x, y, z;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero : ");
		x = entrada.nextInt();
		System.out.println("Digite o segundo n�mero : ");
		y = entrada.nextInt();
		System.out.println("Digite o terceiro n�mero : ");
		z = entrada.nextInt();

		if (x > y && x > z) {
			System.out.println("O primeiro valor informado � o MAIOR ");

		} else if (y > x && y > z) {
			System.out.println("O segundo valor informado � o MAIOR ");

		} else {
			System.out.println("O terceiro valor informado � o MAIOR ");
		}

	}

}
