package br.edu.principal;

import br.edu.calculo.*;
import br.edu.receber.*;

public class Principal {
	public static void main(String[] args) {
		int n1 = ReceberNum.receber(1);
		int n2 = ReceberNum.receber(2);
		int res = Calc.num_entre(n1,n2);
		System.out.println("A soma dos valores entre " + n1 + " e " + n2 + " (inclusive) foi: " + res);
	}
}