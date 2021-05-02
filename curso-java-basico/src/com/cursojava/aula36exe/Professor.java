package com.cursojava.aula36exe;

public class Professor {
	
	private String nomeProf;
	private String departamento;
	private String email;
	
	public String obterInfo() {
		String info = "Dados do professor: " + nomeProf + ", Departamento: " 
	+ departamento + ", Contato: " + email;
	return info;
	}
	
	public Professor() {
	}

	public Professor(String nomeProf, String departamento, String email) {
		this.nomeProf = nomeProf;
		this.departamento = departamento;
		this.email = email;
	}

	public String getNomeProf() {
		return nomeProf;
	}

	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
