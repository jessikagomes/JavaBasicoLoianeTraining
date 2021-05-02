package com.cursojava.aula36exe;

public class Aluno {
	
	private String nomeAluno;
	private String matricula;
	private double[] notas = new double[3];
	
	public String obterInfo() {
		String info = "Dados do Aluno: " + nomeAluno + ", "; 
		info+= "Matricula: " + matricula + ", ";
		info+= "Notas: ";
		
		double soma =0;
		for(double nota : notas) {
			soma+= nota;
			info+=nota + ", ";		
		}
		
		double media = soma/4;
		info += "\n" + "Media =" +media + " - ";
		if(media >=7) {
			info += "Aprovado!";
		}else {
			info += "Reprovado!";
		}
		return info;
	}
	
	public double obterMedia() {
		double soma =0;
		for(double nota : notas) {
			soma +=nota;
		}
		return soma/4;
	}
	
	public Aluno() {
	}

	public Aluno(String nomeAluno, String matricula, double[] notas) {
		super();
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.notas = notas;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
