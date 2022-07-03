package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		int idade, anos, meses, dias;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		anos = entrada.nextInt();
		System.out.println("Informe seu mês de nascimento : ");
		meses = entrada.nextInt();
		System.out.println("Informe seu dia de nascimento : ");
		dias = entrada.nextInt();
	    idade = anos * 365 + meses * 30 + dias;
	    System.out.println("Sua idade expressa em dias equivale a : " + idade);
		
	}

}
