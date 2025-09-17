package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont_time,cont_jog,
		idade,qtde,tot80;
		double peso,alt,media_idade,
		media_altura = 0,porc;
		Scanner sc = new Scanner(System.in);
				
		qtde = 0;
		tot80 = 0;
		
		for (cont_time=1;cont_time<=11;cont_time++) {
			media_idade = 0;
			for (cont_jog=1;cont_jog<=11;cont_jog++) {
				System.out.println("Digite a idade do jogador: ");
				idade = sc.nextInt();
				System.out.println("Digite o peso do jogador: ");
				peso = sc.nextDouble();
				System.out.println("Digite a altura do jogador: ");
				alt = sc.nextDouble();
				
				if (idade<18) { 
					qtde++;
					media_idade += idade;
					media_altura += alt;
				}
				if (peso>80) {
					tot80++;
				}
			}
			media_idade /= 11;
			System.out.println("Média das idades dos jogadores do " + cont_time + "° time: " + media_idade);
		}
		System.out.println("Qtd. de jogadores com menos de 18 anos: " + qtde);
		media_altura /= 55;
		System.out.println("Média das alturas de todos os jogadores do campeonado: " + media_altura);
		porc = tot80*0.55;
		System.out.println("Porcentagem de jogadores do campeonato com mais de 80kg: " + porc);
	}	
	
}
