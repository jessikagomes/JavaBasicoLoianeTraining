package com.cursojava.aula30;

public class Carro {

	private String marca, modelo;
	private int numPassageiro;
	private double capCombustivel, consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiro, 
			double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {}
	
	double obterAutonomia() {
		System.out.print("Metodo obterAutonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		System.out.print("Metodo qtdCombustivel foi chamado.");
		double qtdCombustivel = km/this.consumoCombustivel;
		return qtdCombustivel;	
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(int numPassageiro) {
		this.numPassageiro = numPassageiro;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
