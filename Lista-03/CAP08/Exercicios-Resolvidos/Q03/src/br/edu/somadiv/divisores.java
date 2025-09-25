package br.edu.somadiv;

public class divisores {

	public static int divisores(int a, int b, int c) {
		int i,s,r;
		s=0;	
		for(i=b;b<=c;i++) {
			r = i%a;
			if (r==0) {
				s+=i;
			}
		}
		return s;
	}

}
