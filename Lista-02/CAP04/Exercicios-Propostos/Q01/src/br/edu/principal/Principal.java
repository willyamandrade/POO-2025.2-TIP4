package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1,n2,n3,n4,media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = sc.nextDouble();
		System.out.println("Digite a quarta nota: ");
		n4 = sc.nextDouble();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("Sua média é: " + media);
		if (media>=7) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado!"); 
		}
	}

}
