package br.edu.receber;

import java.util.Scanner;

public class Receber {
	static Scanner sc = new Scanner(System.in);
	
	public static double receberRaio() {
		System.out.println("Digite o raio da esfera: ");
		double raio = sc.nextDouble();
		return raio;
	}

}
