package br.edu.principal;

import java.util.Scanner;

import br.edu.calculo.*;

public class Principal {

	public static void main(String[] args) {
		int hora_i, min_i, hora_f, min_f, minutos;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de início do jogo: ");
		hora_i = sc.nextInt();
		System.out.println("Digite o minuto de início do jogo: ");
		min_i = sc.nextInt();
		System.out.println("Digite a hora de fim do jogo: ");
		hora_f = sc.nextInt();
		System.out.println("Digite o minuto de fim do jogo: ");
		min_f = sc.nextInt();
		
		minutos = Calculo.calculo(hora_i, min_i, hora_f, min_f);
		
		System.out.println("Duração do jogo em minutos: " + minutos + " min.");

	}

}
