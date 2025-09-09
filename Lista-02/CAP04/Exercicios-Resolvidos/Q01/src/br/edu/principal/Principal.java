package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double trab_lab, av_sem, exame_final, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota do Trabalho de Laboratório: ");
		trab_lab = sc.nextDouble();
		System.out.println("Digite a nota da Avaliação Semestral: ");
		av_sem = sc.nextDouble();
		System.out.println("Digite a nota do Exame Final: ");
		exame_final = sc.nextDouble();
		
		media = (trab_lab*2 + av_sem*3 + exame_final*5)/10;
		
		System.out.println("MÉDIA FINAL = " + media);
		
		if (8 <= media & media <= 10) {
			System.out.println("Conceito A");
		}
		else if (media < 8 & media >= 7) {
			System.out.println("Conceito B");
		}
		else if (media < 7 & media >= 6) {
			System.out.println("Conceito C");
		}
		else if (media < 6 & media >= 5) {
			System.out.println("Conceito D");
		}
		else if (0 <= media & media < 5) {
			System.out.println("Conceito E");
		}
	}

}
