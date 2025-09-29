package br.edu.principal;

import br.edu.checagem.*;
import br.edu.receber.*;

public class Principal {

	public static void main(String[] args) {
		int n1 = Receber.recebeInt(1);
		int n2 = Receber.recebeInt(2);
		int res = Checagem.divisivel(n1,n2);
		System.out.println(res);
	}

}
