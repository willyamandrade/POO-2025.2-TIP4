package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salario, novoSalario, aumento, perc;
		
		System.out.println("Digite o seu salário atual: ");
		salario = sc.nextDouble();
		System.out.println("Digite o percentual de aumento: ");
		perc = sc.nextDouble();
		
		aumento = salario * perc/100;
		System.out.println("Seu aumento é: " + aumento);	
		
		novoSalario = salario + aumento;
		
		System.out.println("Seu novo salário é: " + novoSalario);

	}
}
