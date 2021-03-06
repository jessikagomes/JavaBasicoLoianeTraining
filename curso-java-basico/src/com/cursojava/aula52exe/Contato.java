package com.cursojava.aula52exe;

public class Contato {

	private String nome, telefone,email;
	private int id;
	private static int contador =0;
	
	public Contato() {
		contador ++;
		id = contador;
	}

	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		String s = "[";
		s += "Id: "+ id;
		s += ", Nome: "+ nome;
		s += ", Telefone: "+ telefone;
		s += ", Email: "+ email;
		s += "]";
		
		return s;
	}
	
}
