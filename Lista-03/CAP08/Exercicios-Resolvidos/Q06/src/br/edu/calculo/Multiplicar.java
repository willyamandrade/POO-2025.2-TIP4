package br.edu.calculo;

public class Multiplicar {

	public static void multiplicacao(double num) {
		int i,j;
		for (i=1;i<=num;i++) {
			for (j=1;j<=i;j++) {
				System.out.print((i*j) + "	");
			}
			System.out.println();
		}

	}

}
