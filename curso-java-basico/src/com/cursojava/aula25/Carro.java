package com.cursojava.aula25;

public class Carro {

	String marca, modelo;
	int numPassageiro;
	double capCombustivel, consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km");
	}
}
