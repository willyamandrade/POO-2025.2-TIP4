package br.edu.sla;

public class Sla {

	public static double sequencia(double num) {
		double a,b,f,seq;
		seq = 1.0;
		for (a=1;a<=num;a++) {
			f = 1.0;
			for (b=1;b<=a;b++) {
				f += b;
			}
			seq += 1.0/f;
		}
		return seq;
	}

}
