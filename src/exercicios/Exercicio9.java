package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		double codigo , horasT , horaExtra , salarioT , salarioE;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o c�digo : ");
		codigo = entrada.nextDouble();
		System.out.println("Digite o n�mero de horas trabalhadas : ");
		horasT = entrada.nextDouble();
		
		if(horasT > 50) {
			horaExtra = horasT - 50;
			salarioE = horaExtra * 20;
			salarioT = 50*10 + salarioE;
		} 
		else {
			horaExtra = 0 - 0;
			salarioE = 0;
			salarioT = 0;
		}
		
		System.out.printf("O sal�rio total � " + salarioT , " e o sal�rio excedente � : " +  salarioE);
		

	}

}
