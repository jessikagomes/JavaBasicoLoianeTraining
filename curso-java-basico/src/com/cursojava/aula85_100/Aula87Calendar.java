package com.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); //padrão singleton
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);

		System.out.println(hoje);
		System.out.println(ano);

		System.out.printf("Hoje é : %02d/%d", (mes+1),ano);

	}

}
