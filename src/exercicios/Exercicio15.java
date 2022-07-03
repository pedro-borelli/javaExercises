package exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		float custoFab, impostos, distribuidora, custoTotal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o custo de fábrica do carro: ");
		custoFab = entrada.nextFloat();
		impostos = (45* custoFab) / 100; // porcentagem é sempre dividida por 100.
		distribuidora = (28* custoFab) / 100;
		custoTotal = custoFab + impostos + distribuidora;
		
		System.out.println("O valor total do carro com os custos saíra por : " + custoTotal);	
	}

}
