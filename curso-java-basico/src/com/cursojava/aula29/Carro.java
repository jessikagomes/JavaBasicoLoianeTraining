package com.cursojava.aula29;

public class Carro {
	
	String marca, modelo;
	int numPassageiro;
	double capCombustivel, consumoCombustivel;
	
	Carro(){
		numPassageiro = 4;
	}
	
	Carro(String marca_, int numPassageiro_, double capCombustivel_){
		marca = marca_;
		numPassageiro = numPassageiro_;
		capCombustivel = capCombustivel_;
	}
	
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
