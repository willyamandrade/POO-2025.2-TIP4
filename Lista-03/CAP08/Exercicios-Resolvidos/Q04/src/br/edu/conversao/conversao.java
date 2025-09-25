package br.edu.conversao;

public class conversao {

	public static void transformacao(int seg) {
		int h,m,s,r;
		h = seg/3600;
		r = seg%3600;
		m = r/60;
		s = r%60;
		System.out.println(h + ":" + m + ":" + s);
		
	}

}
