package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double dep, taxa, rend, total;
		
		System.out.println("Digite o valor do depósito: ");
		dep = sc.nextDouble();
		System.out.println("Digite o valor da taxa de juros: ");
		taxa = sc.nextDouble();
		
		rend = dep * taxa/100;
		total = dep + rend;
		
		System.out.println("Seu dinheiro rendeu: " + rend);
		System.out.println("Dinheiro total depositado: " + total);
		
	}

}
