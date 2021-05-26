package com.cursojava.aula85_100;

import java.time.LocalTime;

public class LocalTimeJava8 {

	public static void main(String[] args) {

		LocalTime agora = LocalTime.now();
		System.out.println(agora);
		
		LocalTime maisUmaHora = agora.plusHours(1);
		System.out.println(maisUmaHora);

	}

}
