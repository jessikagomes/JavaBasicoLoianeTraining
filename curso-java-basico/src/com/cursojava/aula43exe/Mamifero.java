package com.cursojava.aula43exe;

public class Mamifero extends Animal{
	
	private String alimento;

	public Mamifero() {
		this.setCor("Castanho");
		this.alimento = "Mel";
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String toString() {
		String s = super.toString();
		s +="\nAlimento: "+ alimento;
		return s;
	}
	
}
