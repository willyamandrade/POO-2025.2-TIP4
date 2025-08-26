package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salario, imp, salreceber;
		
		System.out.println("Digite o seu salário base: ");
		salario = sc.nextDouble();
		
		int grat = 50;
		imp = salario * 1/10;
		
		salreceber = salario + grat - imp;
		
		System.out.println("Seu salário líquido é: " + salreceber);

	}

}
