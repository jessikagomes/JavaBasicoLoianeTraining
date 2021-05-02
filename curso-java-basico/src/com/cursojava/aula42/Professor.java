package com.cursojava.aula42;

public class Professor extends Pessoa{
	
	private String nomeCurso;
	private double salario;
	
	public double calcularSalarioLiquido() {
		return 0;
	}

	public Professor() {
	}


	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor: ";
		s +=this.getEndereco();
		return s;
	}

	@Override
	public void imprimiEtiquetaEndereco() {
		// TODO Auto-generated method stub
		
	}

}
