package exercicios;

import java.util.Scanner;

public class Exercicio29 {
	
	/* Uma revendedora de carros paga a seus funcionários um salário fixo por mês
	 * mais uma comissão fixa por carro vendido e mais 5% sobre o total de vendas
	 * efetuadas.
	 * Escreva um algoritmo que leia o número de carros vendidos, o valor total das
	 * vendas efetuadas, o valor que ele recebe por cada carro e o salario fixo e 
	 * calcule o salário do mesmo. */

	public static void main(String[] args) {
		
		int salarioFixo, quantCarro , totalVendas, comissao, resultado;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o salário do funcionário : ");
		salarioFixo = entrada.nextInt();
		System.out.println("Informe a quantidade de carros vendidos : ");
		quantCarro = entrada.nextInt();
		System.out.println("Informe a quantidade de comissão por carro : ");
		comissao = entrada.nextInt();
		System.out.println("Informe o valor total das vendas : ");
		totalVendas = entrada.nextInt();
		
		resultado = salarioFixo + (quantCarro * comissao) + (totalVendas * 5 / 100);
		
		System.out.println("O valor do resultado é :  " + resultado);
		

	}

}
