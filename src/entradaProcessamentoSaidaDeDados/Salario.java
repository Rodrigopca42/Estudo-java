package entradaProcessamentoSaidaDeDados;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		int id;
		int horaTrabalhada;
		double valorPorHora;
		
		id = tec.nextInt();
		horaTrabalhada = tec.nextInt();
		valorPorHora = tec.nextDouble();
		
		double salario = horaTrabalhada * valorPorHora;
		
		System.out.println("NUMBER = "+ id);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		tec.close();
	}
	
}
