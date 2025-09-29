package br.edu.principal;

import br.edu.calculo.*;
import br.edu.receber.*;

public class Principal {

	public static void main(String[] args) {
		double raio = Receber.receberRaio();
		double volEsf = Calculo.volEsfera(raio);
		System.out.println("O volume da esfera é: " + volEsf);
	}

}
