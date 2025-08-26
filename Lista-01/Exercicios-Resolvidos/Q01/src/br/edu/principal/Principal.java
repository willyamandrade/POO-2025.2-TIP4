package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n1, n2, n3, n4, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite n1: ");
		n1 = sc.nextInt();
		System.out.println("Digite n2: ");
		n2 = sc.nextInt();
		System.out.println("Digite n3: ");
		n3 = sc.nextInt();
		System.out.println("Digite n4: ");
		n4 = sc.nextInt();
		
		soma = n1+n2+n3+n4;
		
		System.out.println("A somatória dos números dados é: " + soma);
	}

}
