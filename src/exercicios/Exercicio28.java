package exercicios;

import java.util.Scanner;

public class Exercicio28 {
	 /*
	  * Escreva um algorítmo que receba o salario mensal atual de um colaborador e o percentual
	  * de reajuste. Calcular e escrever o valor do novo salário */

	public static void main(String[] args) {
		
		float salarioMensal, salarioNovo;
		int reajuste;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o salário mensal do colaborador : ");
		salarioMensal = entrada.nextFloat();
		System.out.println("Qual é o percentual do reajuste : ");
		reajuste = entrada.nextInt();
		salarioNovo = salarioMensal * reajuste / 100;
		System.out.println("O valor do novo salário é : " + salarioNovo);
		
	}

}
