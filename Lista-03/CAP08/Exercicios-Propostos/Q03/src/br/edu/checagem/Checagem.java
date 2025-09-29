package br.edu.checagem;

public class Checagem {

	public static int divisivel(int n1, int n2) {
		if (n1%n2==0) {
			return 0;
		}
		else {
			int prox_div = 0;
			int i;
			for (i=n1+1; i<n2; i++) {
				if (n1%i==0) {
					prox_div = i;
					return prox_div;
				}
			}
			if (prox_div!=i) {
				System.out.println("Não existe próximo divisor.");
			}
			
		}
		return 0;
	}

}
