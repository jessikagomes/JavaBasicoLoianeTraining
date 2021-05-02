package com.cursojava.aula44;

public abstract class Animal {
	
	private String nome;
	
	public abstract void emitirSom();

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

}
