package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		float nota1, nota2 , nota3, mediaPonderada; // pesos da media 2,3 e 5 = 10.
		
		Scanner entrada = new Scanner(System.in); // vai fazer a leitura dos dados que o usário digitar.
		
		System.out.println("Informe a primeira nota : ");
		nota1 = entrada.nextFloat();
		System.out.println("Informe a segunda nota : ");
		nota2 = entrada.nextFloat();
		System.out.println("Informe a terceira nota : ");
		nota3 = entrada.nextFloat();
		
		// para calcular a media ponderada deve-se multiplicar os valores pelos pesos, soma-los e dividi-los pela soma dos peso.
		mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("O valor final da média ponderada é : " + mediaPonderada);
		
	}

}
