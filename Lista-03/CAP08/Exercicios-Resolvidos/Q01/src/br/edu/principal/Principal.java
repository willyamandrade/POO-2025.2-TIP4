package br.edu.principal;

import java.util.Scanner;
import br.edu.verificacao.*;

public class Principal {

	public static void main(String[] args) {
		double num;
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		x = verifica.verifica(num);
		
		if (x!=0) {
			System.out.println("Número positivo");
		}
		else {
			System.out.println("Número negativo");
		}
	}

}
