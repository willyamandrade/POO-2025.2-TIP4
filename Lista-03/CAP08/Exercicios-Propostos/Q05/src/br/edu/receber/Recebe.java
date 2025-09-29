package br.edu.receber;

import java.util.Scanner;

public class Recebe {

	public static int numero() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite o valor para o número: ");
		num = sc.nextInt();
		return num;
	}

}
