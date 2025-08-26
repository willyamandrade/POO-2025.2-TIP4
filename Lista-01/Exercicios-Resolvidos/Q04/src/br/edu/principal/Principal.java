package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salario, novoSalario;
		
		System.out.println("Digite o seu salário atual: ");
		salario = sc.nextDouble();
		novoSalario = salario + salario * 25/100;
		
		System.out.println("Seu novo salário é: " + novoSalario);

	}

}
