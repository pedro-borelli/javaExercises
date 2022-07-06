package exercicios;

import java.util.Scanner;

public class Exercicio33 {
	
	/*Faça um programa para ler a quantidade mínima, máxima e atual de um estoque 
	 * Calcule a quantidade da média M=(QNDMAX + QNDMIN)/2, se a quantidade atual
	 * for maior ou igual a quantidade media, escrever "NÃO EFETUAR COMPRA" se estiver
	 * abaixo escrever "EFETUAR COMPRA*/

	public static void main(String[] args) {
		
		int max, min, atual, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade máxima do estoque : ");
		max = entrada.nextInt();
		
		System.out.println("Informe a quantidade mínima do estoque : ");
		min = entrada.nextInt();
		
		System.out.println("Informe a quantidade atual do estoque : ");
		atual = entrada.nextInt();
		
		media = (max + min) / 2;
		
		if(atual >= media) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}

	}

}
