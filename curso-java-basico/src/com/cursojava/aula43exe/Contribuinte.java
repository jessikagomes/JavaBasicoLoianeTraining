package com.cursojava.aula43exe;

public class Contribuinte {
	
	private String nome;
	private double renda;
	private double imposto;
	
	public double calcularImposto() {
		imposto = renda * 0.15;
		return imposto;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public Contribuinte() {
		super();
	}

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", renda=" + renda + ", imposto=" + imposto + "]";
	}
		
	
}
