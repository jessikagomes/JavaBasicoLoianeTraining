package com.cursojava.aula26;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		double autonomia = van.obterAutonomia();
		System.out.println(" A autonomia do carro é: " + autonomia);
		System.out.println(" A autonomia do carro é: " + van.obterAutonomia());
		System.out.println(van.obterAutonomia());
		System.out.println(autonomia);
		
		double qtdCombustivel8 = van.calcularCombustivel(8);
		
		System.out.println("qtdCombustivel8: " + qtdCombustivel8);
	}
	
	

}
