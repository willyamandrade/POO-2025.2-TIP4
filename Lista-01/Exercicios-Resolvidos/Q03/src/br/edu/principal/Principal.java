package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, n3, peso1, peso2, peso3, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua 1ª nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o peso da 1ª nota: ");
		peso1 = sc.nextDouble();
		System.out.println("Digite sua 2ª nota: ");
		n2 = sc.nextDouble();
		System.out.println("Digite o peso da 2ª nota: ");
		peso2 = sc.nextDouble();
		System.out.println("Digite sua 3ª nota: ");
		n3 = sc.nextDouble();
		System.out.println("Digite o peso da 3ª nota: ");
		peso3 = sc.nextDouble();
		
		media = (n1*peso1+n2*peso2+n3*peso3)/(peso1+peso2+peso3);
		
		System.out.println("A média ponderada das notas é: " + media);

	}

}
