package exercicios;

import java.util.Scanner;

public class Exercicio33 {
	
	/*Fa�a um programa para ler a quantidade m�nima, m�xima e atual de um estoque 
	 * Calcule a quantidade da m�dia M=(QNDMAX + QNDMIN)/2, se a quantidade atual
	 * for maior ou igual a quantidade media, escrever "N�O EFETUAR COMPRA" se estiver
	 * abaixo escrever "EFETUAR COMPRA*/

	public static void main(String[] args) {
		
		int max, min, atual, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade m�xima do estoque : ");
		max = entrada.nextInt();
		
		System.out.println("Informe a quantidade m�nima do estoque : ");
		min = entrada.nextInt();
		
		System.out.println("Informe a quantidade atual do estoque : ");
		atual = entrada.nextInt();
		
		media = (max + min) / 2;
		
		if(atual >= media) {
			System.out.println("N�o efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}

	}

}
