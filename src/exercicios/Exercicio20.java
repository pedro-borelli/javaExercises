package exercicios;

import java.util.Scanner;

public class Exercicio20 {

	/*
	 * Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que
	 * s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at�
	 * 500.
	 */

	public static void main(String[] args) {

		int  num, soma = 0;
		
		for(num = 1 ; num <= 500 ; num++) {
			if(num %2 != 0 && num %3 == 0) {
				soma = soma + num;
			}
			
		}
		System.out.println("O resultado da soma de n�meros com m�ltiplos 3 � : " + soma);
	}

}
