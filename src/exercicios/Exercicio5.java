package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int N;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor da variável : "); // entrada de dados
		N = entrada.nextInt(); // saída de dados
		
		if(N > 100) {
			System.out.println(" O valor da variável é :  " + N); 
		} else {
			System.out.println(" O valor da variável é 0");
		}

	}

}
