package com.cursojava.aula55;

import com.cursojava.aula53.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {

		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "TERCA");
		System.out.println(dia);
		
	}

}
