package com.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		aluno.setEndereco("Rua 2 n 2");
		professor.setEndereco("Rua 3 n 3");
		
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}

}
