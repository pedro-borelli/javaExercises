package exercicios;

import java.util.Scanner;

public class Exercicio40 {
	
	/* Ler um valor N e imprimir todos os valores inteiros entre 1 e N
	 * Considere que o N será sempre maior que 0.  */

	public static void main(String[] args) {
		
		int N, contador;
		
		Scanner entrada = new Scanner(System.in);
		
		N = entrada.nextInt();
		
		for(contador = 1 ; contador <=N; contador++) {
			System.out.println(contador);
			
		}

	}

}
