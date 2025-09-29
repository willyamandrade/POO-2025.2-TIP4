package br.edu.receber;

import java.util.Scanner;

public class ReceberNum {
	static Scanner sc = new Scanner(System.in);
	
	public static int receber(int n) {
		int num;
		System.out.println("Digite o valor para o " + n + "º número: ");
		num = sc.nextInt();
		return num;
	}

}
