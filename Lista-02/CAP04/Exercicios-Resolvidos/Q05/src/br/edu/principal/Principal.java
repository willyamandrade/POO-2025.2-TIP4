package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int esc;
		double n1, n2, media, sub, multi, div;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextDouble();
		
		System.out.println("1. Média entre os números digitados");
		System.out.println("2. Diferença do maior pelo menor");
		System.out.println("3. Produto entre os números digitados");
		System.out.println("4. Divisão do primeiro pelo segundo");
		
		System.out.println("Digite a sua escolha de operação: ");
		esc = sc.nextInt();
		
		switch(esc) {
		case 1 -> {
			media = (n1+n2)/2;
			System.out.println("A média entre os números é: " + media);
		}
		case 2 -> {
			sub = n1-n2;
			System.out.println("A diferença entre os números é: " + sub);
		}
		case 3 -> {
			multi = n1*n2;
			System.out.println("A multiplicação entre os números é: " + multi);
		}
		case 4 -> {
			if (n2 != 0) {
				div = n1/n2;
				System.out.println("A divisão entre os números é: " + div);
			}
			else {
				System.out.println("Não foi possível dividir por zero.");
			}
		}
		default -> {System.out.println("Opção inválida.");}
		};
	}

}
