package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		float nota1, nota2, notaFinal;

		Scanner valor = new Scanner(System.in);

		System.out.println("Insira a primeira nota");
		nota1 = valor.nextFloat();
		System.out.println("Insira a segunda nota");
		nota2 = valor.nextFloat();
		notaFinal = nota1 + nota2 / 2;

		if (notaFinal > 5) {
			System.out.println("Sua nota final é : " + notaFinal);
			System.out.println("APROVADO");

		} else {
			System.out.println("Sua nota final é : " + notaFinal);
			System.out.println("REPROVADO");
		}

	}

}
