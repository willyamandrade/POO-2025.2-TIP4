package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont,ta=0,te=0,tr=0;
		double n1,n2,media,media_classe,total_classe;
		Scanner sc = new Scanner(System.in);
		
		total_classe = 0;
		for (cont=1;cont<=6;cont++) {
			System.out.println("Digite a primeira nota: ");
			n1 = sc.nextDouble();
			System.out.println("Digite a segunda nota: ");
			n2 = sc.nextDouble();
			
			media = (n1+n2)/2;
			System.out.println("A média entre as notas " + n1 + " e " + n2 +" é: " + media);
			
			if (media<=3) {
				tr++;
				System.out.println("Reprovado");
			}
			else if (media > 3 & media < 7) {
				te++;
				System.out.println("Exame");
			}
			else if (media >= 7) {
				ta++;
				System.out.println("Aprovado");
			}
			total_classe += media;
		}
		System.out.println("\nQtd. de reprovados: " + tr);
		System.out.println("Qtd. de exame: " + te);
		System.out.println("Qtd. de aprovados " + ta);
		media_classe = total_classe/6;
		System.out.println("Média da classe: " + media_classe);
	}

}
