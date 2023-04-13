package entradaProcessamentoSaidaDeDados;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio;
		
		raio = tec.nextDouble();
		
		//Math.pow(raio, 2) é a potencia de algum número;
		double area = pi * Math.pow(raio, 2);
		
		
		System.out.printf("A = %.4f", area);
		
		
		tec.close();
	}
	
}
