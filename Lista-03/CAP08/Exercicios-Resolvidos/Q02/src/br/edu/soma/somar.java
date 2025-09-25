package br.edu.soma;

public class somar {

	public static double somar(double num1, double num2) {
		double i;
		double s;
		s=0;
		for (i=num1+1;i<=num2-1;i++) {
			s+=i;
		}
		return s;
	}

}
