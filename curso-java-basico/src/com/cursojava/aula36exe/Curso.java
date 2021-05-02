package com.cursojava.aula36exe;

public class Curso {

	private String nomeCurso;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	public String obterInfo() {
		System.out.println("-------------");
		String info = "NOME DO CURSO: " + nomeCurso + "\n ";
		info += "HORARIO: " + horario + "\n ";

		if (professor != null) {
			info += professor.obterInfo();
			info += "\n";
		}

		if (alunos != null) {
			
			for (Aluno aluno : alunos) {
				if (aluno != null) {
					info += aluno.obterInfo();
					info += "\n";
				}
			}
			info += "\nMedia da turma = " + obterMediaTurma();
		}

		return info;
	}

	public double obterMediaTurma() {
		double soma = 0;
		for (Aluno aluno : alunos) {
			if (aluno != null) {
				soma += aluno.obterMedia();
			}
		}
		return soma/alunos.length;
	}

	public Curso() {
	}

	public Curso(String nomeCurso, String horario, Professor professor, Aluno[] alunos) {
		this.nomeCurso = nomeCurso;
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

}
