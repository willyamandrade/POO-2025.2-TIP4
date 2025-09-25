package br.edu.principal;

import java.util.Scanner;

import br.edu.sla.*;

public class Principal {

	public static void main(String[] args) {
		double num,s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		s = Sla.sequencia(num);
		System.out.println(s);

	}

}
