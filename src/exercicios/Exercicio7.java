package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor : ");
		num = entrada.nextInt();
		
		if(num %2 == 0 ) {
			System.out.println("Esse valor é PAR ");
		}
		else {
			System.out.println("Esse valor é IMPAR ");
		}
		
		if(num >= 0) {
			System.out.println("e POSITIVO TAMBÉM");
		}
		else {
			System.out.println("e NEGATIVO TAMBÉM");
		}
			
	}

}
