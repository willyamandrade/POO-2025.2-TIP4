package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1,n2,media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		
		media = (n1+n2)/2;
		
		if (media<3 & media>=0) {
			System.out.println("Reprovado");
		}
		else if (media < 7 & media >= 3) {
			System.out.println("Exame");
		}
		else if (media <= 10 & media >= 7) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Nota inválida.");
		}
	}
}
