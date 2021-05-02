package com.cursojava.aula26;

public class Carro {

	String marca, modelo;
	int numPassageiro;
	double capCombustivel, consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {	
		System.out.print("Metodo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;	
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
