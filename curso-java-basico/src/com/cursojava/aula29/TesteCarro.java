package com.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.numPassageiro);
		
		Carro van2 = new Carro("Fiat",8,100);

		System.out.println(van2.marca);
		System.out.println(van2.numPassageiro);
		System.out.println(van2.capCombustivel);
	}

}
