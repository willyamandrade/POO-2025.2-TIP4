package br.edu.principal;

import java.util.Scanner;
import br.edu.conversao.*;
public class Principal {

	public static void main(String[] args) {
		int seg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de segundos: ");
		seg = sc.nextInt();
		
		conversao.transformacao(seg);
	}

}
