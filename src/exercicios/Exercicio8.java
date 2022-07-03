package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double P, E, M; // PESO , EXCESSO E MULTA
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o PESO TOTAL dos tomates : ");
		P = entrada.nextDouble();
		E = P - 50;
		M = E * 4.00;
		
		
		if(P <= 50) {
			System.out.println("O valor da MULTA será 0");
		}
		else {
			System.out.println("O valor da MULTA será de : " + M);
		}
		
			
	}

}
