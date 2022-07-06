package exercicios;

import java.util.Scanner;

public class Exercicio27 {

	/* Escreva  um algorítmo para ler o numero total de  eleitores de um munícipio, o número de votos
	 * brancos , nulos e validos. Calcule e escreva o percentual que cada um representa em relação ao
	 * total de eleitores. */

	public static void main(String[] args) {
		
		int numEleitores, votosBrancos, votosNulos, votosVal, percentualBrancos, percentualNulos, percentualVal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número total de eleitores : ");
		numEleitores = entrada.nextInt();
		System.out.println("Informe o número total de votos brancos : ");
		votosBrancos = entrada.nextInt();
		System.out.println("Informe o número total de votos nulos : ");
		votosNulos = entrada.nextInt();
		System.out.println("Informe o número total de votos válidos : ");
		votosVal = entrada.nextInt();
		
		percentualBrancos = votosBrancos * 100 / numEleitores;
		percentualNulos = votosNulos * 100 / numEleitores;
		percentualVal = votosVal * 100 / numEleitores;
		
		System.out.println("O percentual de  votos brancos é de  : " + percentualBrancos);
		System.out.println("O percentual de votos nulos é de  : " +  percentualNulos);
		System.out.println("O percentual de votos válidos é de : " + percentualVal);
		

	}

}
