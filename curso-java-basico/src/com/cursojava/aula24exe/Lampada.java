package com.cursojava.aula24exe;

public class Lampada {
	
	int potencia,garantia;
	String cor, modelo;
	String[] tipos;
	boolean ligada;
	
	void desligar() {
		ligada=false;
		System.out.println("Lâmpada desligada");
	
	}
	
	void ligar() {
		ligada=true;
		System.out.println("Lâmpada ligada");
	}
	
	
}
