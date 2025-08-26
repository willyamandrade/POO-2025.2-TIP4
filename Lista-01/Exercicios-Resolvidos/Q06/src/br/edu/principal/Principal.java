package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salario, grat, imp, salreceber;
		
		System.out.println("Digite o seu salário base: ");
		salario = sc.nextDouble();
		
		grat = salario * 5/100;
		imp = salario * 7/100;
		
		salreceber = salario + grat - imp;
		
		System.out.println("Seu salário líquido é: " + salreceber);

	}

}
