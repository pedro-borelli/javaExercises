package exercicios;

import java.util.Scanner;

public class Exercicio34 {

	/*
	 * Ler 3 valores (A,B,C) cada um representando a medida de um triângulo e
	 * escrever se formam ou não um triângulo. ObS. Para formar um triângulo o valor
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
					System.out.println("Temos um triângulo! ");
				} 
			}
		} else {
			System.out.println("Não temos um triângulo! : ");
		}
	}

}
