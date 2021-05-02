package com.cursojava.aula33exe;

public class AlunoExer03 {

	private String nome, matricula, curso;
	private String[] diciplinas;
	private double[] notas;
	
	public AlunoExer03() {}
	
	public AlunoExer03(String nome, String matricula, String curso, String[] diciplinas, double[] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.diciplinas = diciplinas;
		this.notas = notas;
	}

	public void boletim() {
		System.out.println(" BOLETIM ");
		System.out.println("-------- ");
		System.out.println("Aluno: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Matricula: " + matricula);
		System.out.println("-------- ");
		System.out.println("DICIPLINAS E NOTAS ");
		for (int i = 0; i < 3; i++) {
			System.out.print(diciplinas[i] + " " + notas[i]);
			if (notas[i] > 7) {
				System.out.println(" = APROVADO");
			} else {
				System.out.println(" = REPROVADO");
			}
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(String[] diciplinas) {
		this.diciplinas = diciplinas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
}
