package com.cursojava.aula24exe;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.cor = "Amarela";
		lampada.potencia = 7;
		lampada.garantia = 3;		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Luminária";
				
		lampada.desligar();		
		lampada.ligar();
	
	}

}
