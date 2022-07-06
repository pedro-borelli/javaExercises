package exercicios;

import java.util.Scanner;

public class Exercicio26 {
	
	/* Escreva um algorítmo  para ler as dimensões de um  retângulo ( base * altura ) e calcule sua área*/

	public static void main(String[] args) {
		
		int  altura, base , area;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a base do retângulo :" );
		base = entrada.nextInt();
		System.out.println("Informe a altura do retângulo :" );
		altura = entrada.nextInt();
		area = base * altura;
		
		System.out.println("A area do retângulo é : " + area);
		
		
	}

}
