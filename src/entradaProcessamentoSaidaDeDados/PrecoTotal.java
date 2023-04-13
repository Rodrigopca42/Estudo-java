package entradaProcessamentoSaidaDeDados;

import java.util.Scanner;

public class PrecoTotal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		int cod1, cod2, quant1, quant2;
		
		double preco1, preco2, total;
		
		cod1 = tec.nextInt();
		quant1 = tec.nextInt();
		preco1 = tec.nextDouble();
		
		cod2 = tec.nextInt();
		quant2 = tec.nextInt();
		preco2 = tec.nextDouble();
		
		total = quant1 * preco1 + quant2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		tec.close();
	}

}
