package exercicios;

import java.util.Scanner;

public class Exercicio21 {
	/*
	 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	 * apresente no final o total do somatório, a média e o total de valores lidos.
	 * O programa deve fazer as leituras dos valores enquanto o usuário estiver
	 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário
	 * fornecer um valor negativo.
	 */
	public static void main(String[] args) {
		
		int num= 0, media, total = 0, cont=0;
		
		Scanner entrada = new Scanner(System.in);
		
		while (num >= 0) {
			System.out.println("Informe um valor positivo : ");
			num = entrada.nextInt();
			
			if(num >= 0 ) {
				total +=  num;
				cont++;
			}
		}
		
		media = total / cont;
		
		System.out.println("Somatório: " + total);
		System.out.println("Média : " + media);
		System.out.println("Total de valores lidos : " + cont);
		
		
	}

}
