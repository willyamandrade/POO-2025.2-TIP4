package br.edu.receber;

import java.util.Scanner;

public class Receber {
	static Scanner sc = new Scanner(System.in);
	
	public static int recHorario(String qualé) {
		int coiso;
		System.out.println("Digite os(as) " + qualé + ": ");
		coiso = sc.nextInt();
		return coiso;
	}
}

