package com.cursojava.aula33exe;

public class LampadaExer01 {

	private int potencia,garantia;
	private String cor, modelo;
	private String[] tipos;
	private boolean ligada;
	
	public LampadaExer01(int potencia, int garantia, String cor, 
			String modelo, boolean ligada) {
		this.potencia = potencia;
		this.garantia = garantia;
		this.cor = cor;
		this.modelo = modelo;
		this.ligada = ligada;
	}

	public LampadaExer01() {}

	public void desligar() {
		ligada=false;
		System.out.println("Lâmpada desligada");
	}
	
	public void ligar() {
		ligada=true;
		System.out.println("Lâmpada ligada");
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	
}
