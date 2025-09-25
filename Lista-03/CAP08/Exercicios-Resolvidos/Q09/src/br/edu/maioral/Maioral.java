package br.edu.maioral;

import java.util.Scanner;

public class Maioral {

	public static void maior_menor() {
		double num,maior=0,menor=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			System.out.println("Digite o " + i + "º número:");
			num = sc.nextDouble();
			if (i==1) {
				maior = num;
				menor = num;
			}
			else {
				if (num>maior) {
					maior = num;
				}
				if (num<menor) {
					menor = num;
				}
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O maior menor digitado foi: " + menor);
	}

}
