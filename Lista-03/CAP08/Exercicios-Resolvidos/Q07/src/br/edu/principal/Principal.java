package br.edu.principal;

import java.util.Scanner;

import br.edu.media.*;

public class Principal {

	public static void main(String[] args) {
		double n1,n2,n3,m;
		String letra;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		n2 = sc.nextDouble();
		System.out.println("Digite a nota 3: ");
		n3 = sc.nextDouble();
		
		do {
			System.out.println("Digite a letra: ");
			System.out.println("A: Média Aritmética \nP: Média Ponderada com pesos 5, 3 e 2");
			letra = sc.next().toUpperCase();
		} while(!letra.equals("A") & !letra.equals("P"));

		m = Media.calcula_media(n1,n2,n3,letra);
		
		if (letra.equals("A")) {
			System.out.println("A média aritmética é: " + m);
		}
		else {
			System.out.println("A média ponderada é: " + m);
		}
	}

}
