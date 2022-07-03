package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Infome um número : ");
		num = entrada.nextInt();
		
		if(num %2 == 0) {
			System.out.println("O valor digitado é PAR ");
		} else {
			System.out.println("O valor digitado é IMPAR ");
		}
		
		if(num %2 == 0) {
			Math.sqrt(num);
			System.out.println("A raiz quadrada desse valor é : " + Math.sqrt(num));
		} else {
			Math.pow(num, num);
			System.out.println("O valor desse número elevado ao quadrado é : " + Math.pow(num, num));
		}

	}

}
