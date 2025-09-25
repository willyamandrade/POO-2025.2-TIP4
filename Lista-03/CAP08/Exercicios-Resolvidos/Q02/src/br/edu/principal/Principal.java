package br.edu.principal;

import java.util.Scanner;
import br.edu.soma.*;

public class Principal {

	public static void main(String[] args) {
		double num1,num2,s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de n1:");
		num1 = sc.nextDouble();
		System.out.println("Digite o valor de n2:");
		num2 = sc.nextDouble();
		
		s = somar.somar(num1,num2);
		System.out.println("soma = " + s);

	}

}
