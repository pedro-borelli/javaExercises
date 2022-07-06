package exercicios;

import java.util.Scanner;

public class Exercicio25 {
	
	/* Escreva um algorítmo para ler um valor e escrever na tela o seu antecessor */

	public static void main(String[] args) {
		
		int num, antecessor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor : ");
		num = entrada.nextInt();
		
		antecessor = num - 1;
		
		System.out.println("O antecessor deste valor é : " + antecessor);

	}

}
