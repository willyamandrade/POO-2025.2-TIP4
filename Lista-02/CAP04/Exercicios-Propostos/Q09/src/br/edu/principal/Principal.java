package br.edu.principal;

import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
	Calendar c = Calendar.getInstance();
	Date d = new Date();
	int dia = c.get(Calendar.DAY_OF_MONTH);
	int mes = c.get(Calendar.MONTH) + 1;
	int ano = c.get(Calendar.YEAR);
	
	System.out.println("Data atual: " + dia + "/" + mes + "/" + ano + " – ");
	switch(mes) {
	case 1 -> System.out.println("Janeiro");
	case 2 -> System.out.println("Fevereiro");
	case 3 -> System.out.println("Março");
	case 4 -> System.out.println("Abril");
	case 5 -> System.out.println("Maio");
	case 6 -> System.out.println("Junho");
	case 7 -> System.out.println("Julho");
	case 8 -> System.out.println("Agosto");
	case 9 -> System.out.println("Setembro");
	case 10 -> System.out.println("Outubro");
	case 11 -> System.out.println("Novembro");
	case 12 -> System.out.println("Dezembro");
	default -> {}	
	};
	
	c.setTime(d);
	int hora = c.get(Calendar.HOUR_OF_DAY);
	int min = c.get(Calendar.MINUTE);
	
	System.out.println("Hora atual: ");
	System.out.println(hora + ":" + min);
	}

}
