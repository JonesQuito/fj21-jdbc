package br.com.caelum.testesExternos;

import java.text.DateFormat;
import java.util.Calendar;


public class Data_Calendar {
	
	public static void main(String[] args){
		
		Calendar c = Calendar.getInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println("Data e Hora atual: " + c.getTime());
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia: " + c.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Data Formatada com DateFormat: " + df.format(c.getTime()));
	}

}
