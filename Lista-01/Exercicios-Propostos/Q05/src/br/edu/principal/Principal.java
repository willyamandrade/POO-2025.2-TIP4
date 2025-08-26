package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double preco, novopreco;
		
		System.out.println("Digite o do preço do produto: ");
		preco = sc.nextDouble();
		novopreco = preco * 9/10;
		
		System.out.println("Novo preço: " + novopreco);
		
	}

}
