package br.edu.principal;

import br.edu.receber.*;
import br.edu.verificacao.*;

public class Principal {

	public static void main(String[] args) {
		double n1 = Recebe.numero();
		Verificar.pos_ou_neg(n1);
	}

}
