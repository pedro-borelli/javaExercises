package exercicios;

import java.util.Scanner;

public class Exercicio26 {
	
	/* Escreva um algor�tmo  para ler as dimens�es de um  ret�ngulo ( base * altura ) e calcule sua �rea*/

	public static void main(String[] args) {
		
		int  altura, base , area;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a base do ret�ngulo :" );
		base = entrada.nextInt();
		System.out.println("Informe a altura do ret�ngulo :" );
		altura = entrada.nextInt();
		area = base * altura;
		
		System.out.println("A area do ret�ngulo � : " + area);
		
		
	}

}
