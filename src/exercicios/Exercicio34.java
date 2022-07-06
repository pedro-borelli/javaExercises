package exercicios;

import java.util.Scanner;

public class Exercicio34 {

	/*
	 * Ler 3 valores (A,B,C) cada um representando a medida de um tri�ngulo e
	 * escrever se formam ou n�o um tri�ngulo. ObS. Para formar um tri�ngulo o valor
	 * de cada lado deve ser menor que a soma dos outros dois lados
	 */

	public static void main(String[] args) {

		float A, B, C;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com a primeira medida : ");
		A = entrada.nextFloat();
		System.out.println("Entre com a segunda medida : ");
		B = entrada.nextFloat();
		System.out.println("Entre com a terceira medida : ");
		C = entrada.nextFloat();

		if (A < B + C) {
			if (B < A + C) {
				if (C < A + B) {
					System.out.println("Temos um tri�ngulo! ");
				} 
			}
		} else {
			System.out.println("N�o temos um tri�ngulo! : ");
		}
	}

}
