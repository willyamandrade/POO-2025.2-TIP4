package br.edu.calculo;

public class Calc {

	public static int num_entre(int n1, int n2) {
		int soma = 0;
		for (int i=n1; i<=n2; i++) {
			soma += i;
		}
		return soma;
	}

}
