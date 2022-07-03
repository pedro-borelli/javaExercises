package exercicios;

import java.util.Scanner;

public class Exercicio16 {
	
	/* Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. */

	public static void main(String[] args) {

		int num;

		Scanner entrada = new Scanner(System.in);

		for (num = 1000; num <= 1999; num++) {
			if (num % 11 == 5) {
				System.out.println(num);
			}
		}

	}

}
