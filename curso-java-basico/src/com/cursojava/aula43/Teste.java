package com.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencia da Computacao");
		double[] notas = {10,9,7,9};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
	}

}
