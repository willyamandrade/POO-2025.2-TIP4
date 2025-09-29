package br.edu.conversao;

public class Conv {

	public static int hora_pra_seg(int h, int m, int s) {
		int h_s, m_s;
		h_s = h*3600;
		m_s = m*60;
		int soma = h_s + m_s + s;
		return soma;
	}
}
