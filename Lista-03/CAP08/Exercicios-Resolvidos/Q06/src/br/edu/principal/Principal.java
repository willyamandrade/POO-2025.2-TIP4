package br.edu.principal;

import java.util.Scanner;
import br.edu.calculo.*;

public class Principal {

	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número de 1 a 9: ");
			num = sc.nextDouble();
		} while (num<1 & num>9);
		
		Multiplicar.multiplicacao(num);

	}

}
