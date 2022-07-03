package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		int idadeNadador;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a idade do nadador : ");
		idadeNadador = entrada.nextInt();
		
		if(idadeNadador >= 5 && idadeNadador <= 7) {
			System.out.println("CATEGORIA INFANTIL A ");
		}
		
		else if(idadeNadador >= 8 && idadeNadador <=11) {
			System.out.println("CATEGORIA INFANTIL B ");
		}
		
		else if(idadeNadador >= 12 && idadeNadador <=13) {
			System.out.println("CATEGORIA JUVENIL A ");
		}
		
		else if(idadeNadador >= 14 && idadeNadador <=17) {
			System.out.println("CATEGORIA JUVENIL B ");
		}
		
		else if(idadeNadador > 18) {
			System.out.println("CATEGORIA ADULTO(A) ");
		}
		else {
			System.out.println("A IDADE INFORMADA NÃO POSSUÍ UMA CATEGORIA!");
		
		}
		
		
	}

}
