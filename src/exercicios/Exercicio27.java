package exercicios;

import java.util.Scanner;

public class Exercicio27 {

	/* Escreva  um algor�tmo para ler o numero total de  eleitores de um mun�cipio, o n�mero de votos
	 * brancos , nulos e validos. Calcule e escreva o percentual que cada um representa em rela��o ao
	 * total de eleitores. */

	public static void main(String[] args) {
		
		int numEleitores, votosBrancos, votosNulos, votosVal, percentualBrancos, percentualNulos, percentualVal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o n�mero total de eleitores : ");
		numEleitores = entrada.nextInt();
		System.out.println("Informe o n�mero total de votos brancos : ");
		votosBrancos = entrada.nextInt();
		System.out.println("Informe o n�mero total de votos nulos : ");
		votosNulos = entrada.nextInt();
		System.out.println("Informe o n�mero total de votos v�lidos : ");
		votosVal = entrada.nextInt();
		
		percentualBrancos = votosBrancos * 100 / numEleitores;
		percentualNulos = votosNulos * 100 / numEleitores;
		percentualVal = votosVal * 100 / numEleitores;
		
		System.out.println("O percentual de  votos brancos � de  : " + percentualBrancos);
		System.out.println("O percentual de votos nulos � de  : " +  percentualNulos);
		System.out.println("O percentual de votos v�lidos � de : " + percentualVal);
		

	}

}
