package br.edu.principal;

import br.edu.conversao.*;
import br.edu.receber.Receber;

public class Principal {

	public static void main(String[] args) {
		int h = Receber.recHorario("horas");
		int m = Receber.recHorario("minutos");
		int s = Receber.recHorario("segundos");
		int segConv = Conv.hora_pra_seg(h,m,s);
		System.out.println("O total de horas, minutos e segundos em segundos é: " + segConv);
	}

}
