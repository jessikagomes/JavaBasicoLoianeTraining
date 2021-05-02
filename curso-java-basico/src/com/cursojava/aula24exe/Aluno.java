package com.cursojava.aula24exe;

public class Aluno {

	String nome, matricula, curso;
	String[] diciplinas;
	double[] notas;

	void boletim() {
		System.out.println(" BOLETIM ");
		System.out.println("-------- ");
		System.out.println("Aluno: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Matricula: " + matricula);
		System.out.println("-------- ");
		System.out.println("DICIPLINAS E NOTAS ");
		for (int i = 0; i < 3; i++) {
			System.out.print(diciplinas[i] + "" + notas[i]);
			if(notas[i] > 7) {
				System.out.println(" = APROVADO");				
			} else {
				System.out.println(" = REPROVADO");
			}
		}

	}
}
