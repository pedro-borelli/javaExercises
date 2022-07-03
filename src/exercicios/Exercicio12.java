package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		int idadeEmDias, idadeEmAnos , mesDeNasc, diaDeNasc;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua idade em dias : ");
		idadeEmDias = entrada.nextInt();
		idadeEmAnos = idadeEmDias / 365;
		mesDeNasc = (idadeEmDias % 365) / 30;
		diaDeNasc = (idadeEmDias % 365) % 30;
		System.out.printf("Você possuí " + idadeEmAnos  + " anos , ");  
		System.out.printf(" nasceu no mês " + mesDeNasc);
		System.out.printf("  e no dia " + diaDeNasc);
	}

}
