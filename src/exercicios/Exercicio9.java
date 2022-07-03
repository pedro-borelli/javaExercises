package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		double codigo , horasT , horaExtra , salarioT , salarioE;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o código : ");
		codigo = entrada.nextDouble();
		System.out.println("Digite o número de horas trabalhadas : ");
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
		
		System.out.printf("O salário total é " + salarioT , " e o salário excedente é : " +  salarioE);
		

	}

}
