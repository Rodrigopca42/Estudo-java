package entradaProcessamentoSaidaDeDados;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		int x, y;
		
		x = tec.nextInt();
		y = tec.nextInt();
		
		int soma = x + y;
		
		System.out.println("SOMA = "+ soma);
		
		
		tec.close();
	}

}
