package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area;
		
		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		
		area = Math.pow(raio, 2) * Math.PI;
		
		System.out.println("Área do círculo: " + area);
	}

}
