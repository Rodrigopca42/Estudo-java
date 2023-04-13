package entradaProcessamentoSaidaDeDados;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		int a, b, c, d;
		
		a = tec.nextInt();
		b = tec.nextInt();
		c = tec.nextInt();
		d = tec.nextInt();
		
		int diferenca = a * b - c * d;
		
		System.out.println("DIFERENÇA = "+ diferenca);
		
		
		tec.close();
	}
	
}
