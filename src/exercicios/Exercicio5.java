package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int N;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor da vari�vel : "); // entrada de dados
		N = entrada.nextInt(); // sa�da de dados
		
		if(N > 100) {
			System.out.println(" O valor da vari�vel � :  " + N); 
		} else {
			System.out.println(" O valor da vari�vel � 0");
		}

	}

}
