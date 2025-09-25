package br.edu.principal;

import java.util.Scanner;
import br.edu.calculoreaj.*;

public class Principal {

	public static void main(String[] args) {
		double precoantigo, precoatual, acrescimo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor antigo do produto: ");
		precoantigo = sc.nextDouble();
		System.out.println("Digite o valor atual do produto: ");
		precoatual = sc.nextDouble();
		
		acrescimo = Calculoreaj.calculo_reajuste(precoantigo, precoatual);
		
		System.out.println("O preço teve um acréscimo de " + acrescimo + "%");

	}

}
