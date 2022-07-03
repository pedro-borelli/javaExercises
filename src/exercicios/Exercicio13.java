package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		int horas, minutos, segundos, duracao;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quanto tempo durou o evento?");
		duracao = entrada.nextInt();
		horas = duracao / 3600;
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60;
		System.out.printf("A duração do evento  foi de " + horas + " horas ,  " + minutos + " minutos  e " + segundos + " segundos. ");

	}

}
