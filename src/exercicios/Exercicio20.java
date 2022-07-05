package exercicios;

import java.util.Scanner;

public class Exercicio20 {

	/*
	 * Desenvolver um sistema que efetue a soma de todos os números ímpares que
	 * são múltiplos de três e que se encontram no conjunto dos números de 1 até
	 * 500.
	 */

	public static void main(String[] args) {

		int  num, soma = 0;
		
		for(num = 1 ; num <= 500 ; num++) {
			if(num %2 != 0 && num %3 == 0) {
				soma = soma + num;
			}
			
		}
		System.out.println("O resultado da soma de números com múltiplos 3 é : " + soma);
	}

}
