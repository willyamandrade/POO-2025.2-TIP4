package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int cont,codigo,nht;
		double sal_min,sal_inicial,aux,sal_final,valor;
		String turno,categoria;
		Scanner sc = new Scanner(System.in);
		
		sal_min = 450;
		for (cont=1;cont<=10;cont++) {
			
			System.out.println("Digite o código de funcionário: ");
			codigo = sc.nextInt();
			
			System.out.println("Digite o número de horas trabalhadas no mês: ");
			nht = sc.nextInt();
				
			do {
				System.out.println("Digite o turno do funcionário (M, V ou N): ");
				System.out.println("M = Manhã\nV = Vespertino\nN = Noturno");
				turno = sc.next().toUpperCase();
			} while (turno!="M" & turno!="V" & turno!="N");
			
			do {
				System.out.println("Digite a categoria do funcionário (G ou O): ");
				System.out.println("G = Gerente\nO = Operário");
				categoria = sc.next().toUpperCase();
			} while (categoria!="G" & categoria!="O");
			
			if (categoria=="G"){
				if (turno=="N") {
					valor = sal_min*0.18;
				}
				else {
					valor = sal_min*0.15;
				}
			}
			else {
				if (turno=="N") {
					valor = sal_min*0.13;
				}
				else {
					valor = sal_min*0.1;
				}
			}
			sal_inicial = nht*valor;
			if (sal_inicial<=300) {
				aux = sal_inicial*0.2;
			}
			else if (sal_inicial<600) {
				aux = sal_inicial*0.15;
			}
			else {
				aux = sal_inicial*0.05;
			}
			sal_final = sal_inicial+aux;
			System.out.println("Código do Funcionário: " + codigo);
			System.out.println("Nº de horas trabalhadas no mês: " + nht);
			System.out.println("Valor: " + valor);
			System.out.println("Valor do salário inicial: " + sal_inicial);
			System.out.println("Valor do áuxilio alimentação: " + aux);
			System.out.println("Valor do salário final: " + sal_final);
		}

	}

}
