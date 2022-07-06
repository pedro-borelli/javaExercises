package exercicios;

import java.util.Scanner;

public class Exercicio32 {

	/*
	 * Faça um algorítmo para ler um número da conta do cliente, saldo, débito,
	 * crédito. Após calcular e escrever o saldo atual. Também testar se o saldo
	 * atual for maior ou igual a zero e escrever a mensagem saldo positivo ou saldo
	 * negativo.
	 */

	public static void main(String[] args) {

		int conta;
		float saldo, debito, credito, saldoAtual;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o número da conta : ");
		conta = entrada.nextInt();
		System.out.println("Qual o valor do saldo : ");
		saldo = entrada.nextFloat();
		System.out.println("Valor da despesa: ");
		debito = entrada.nextFloat();
		System.out.println("Valor de entrada : ");
		credito = entrada.nextFloat();
		saldoAtual = saldo + credito - debito;
		System.out.println("Seu saldo atual é de : " + saldoAtual);

	}

}
