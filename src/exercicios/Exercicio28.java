package exercicios;

import java.util.Scanner;

public class Exercicio28 {
	 /*
	  * Escreva um algor�tmo que receba o salario mensal atual de um colaborador e o percentual
	  * de reajuste. Calcular e escrever o valor do novo sal�rio */

	public static void main(String[] args) {
		
		float salarioMensal, salarioNovo;
		int reajuste;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio mensal do colaborador : ");
		salarioMensal = entrada.nextFloat();
		System.out.println("Qual � o percentual do reajuste : ");
		reajuste = entrada.nextInt();
		salarioNovo = salarioMensal * reajuste / 100;
		System.out.println("O valor do novo sal�rio � : " + salarioNovo);
		
	}

}
