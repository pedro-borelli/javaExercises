package exercicios;

import java.util.Scanner;

public class Exercicio32 {

	/*
	 * Fa�a um algor�tmo para ler um n�mero da conta do cliente, saldo, d�bito,
	 * cr�dito. Ap�s calcular e escrever o saldo atual. Tamb�m testar se o saldo
	 * atual for maior ou igual a zero e escrever a mensagem saldo positivo ou saldo
	 * negativo.
	 */

	public static void main(String[] args) {

		int conta;
		float saldo, debito, credito, saldoAtual;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o n�mero da conta : ");
		conta = entrada.nextInt();
		System.out.println("Qual o valor do saldo : ");
		saldo = entrada.nextFloat();
		System.out.println("Valor da despesa: ");
		debito = entrada.nextFloat();
		System.out.println("Valor de entrada : ");
		credito = entrada.nextFloat();
		saldoAtual = saldo + credito - debito;
		System.out.println("Seu saldo atual � de : " + saldoAtual);

	}

}
