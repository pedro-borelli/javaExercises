package exercicios;

public class Exercicio23 {

	/*
	 * Faça um programa que mostre uma contagem na tela de 233 a 456, só que
	 * contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não
	 * estiver
	 */

	public static void main(String[] args) {
		
		int num=233;
		
		System.out.println("Num " + num);
		
		do {
			
			num +=3;
			
			System.out.println("Num " + num);
			
			while (num >= 300 &&  num <=400) {
				
				num +=5;
				
				System.out.println("Num " + num);
			}
			
		} while (num <= 456); 

	}

}
