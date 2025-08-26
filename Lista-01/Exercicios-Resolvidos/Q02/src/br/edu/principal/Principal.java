package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua 1ª nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite sua 2ª nota: ");
		n2 = sc.nextDouble();
		System.out.println("Digite sua 3ª nota: ");
		n3 = sc.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("A média aritmética das notas é: " + media);

	}

}
