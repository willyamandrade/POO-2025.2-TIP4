package br.edu.receber;

import java.util.Scanner;

public class Receber {
	static Scanner sc = new Scanner(System.in);
	public static int recebeInt(int n) {
		System.out.println("Digite o " + n + "º número: ");
		int num = sc.nextInt();
		return num;
	}

}
