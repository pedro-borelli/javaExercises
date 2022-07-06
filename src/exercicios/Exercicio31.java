package exercicios;

import java.util.Scanner;

public class Exercicio31 {
	
	/* Ler dois valores e informar qual deles é o maior valor */

	public static void main(String[] args) {
		
		int val1, val2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor : ");
		val1 = entrada.nextInt();
		System.out.println("Digite o segundo valor : ");
		val2 = entrada.nextInt();
		
		if(val1 > val2) {
			System.out.println("O primeiro número é o de maior valor");
		} else {
			System.out.println("O segundo número é o de maior valor ");
		}
	}

}
