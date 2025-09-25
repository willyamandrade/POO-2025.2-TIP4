package br.edu.principal;

import java.util.Scanner;
import br.edu.somadiv.*;
public class Principal {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		do {	
			System.out.println("Digite o valor de a:");
			a = sc.nextInt();
		} while (a>1);
		
		System.out.println("Digite o valor de b:");
		b = sc.nextInt();
		System.out.println("Digite o valor de c:");
		c = sc.nextInt();
		
		int result = somadiv.divisores(a,b,c);
		System.out.println("Soma dos inteiros = " + result);
	}

}
