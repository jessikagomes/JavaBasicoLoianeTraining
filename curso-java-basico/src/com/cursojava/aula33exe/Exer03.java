package com.cursojava.aula33exe;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		AlunoExer03 aluno = new AlunoExer03();
		aluno.setDiciplinas(new String[3]);
		aluno.setNotas(new double[3]);

		System.out.print("Digite o nome do aluno: ");
		aluno.setNome(scan.next());

		System.out.print("Digite o Curso: ");
		aluno.setCurso(scan.next());

		System.out.print("Digite a Matricula: ");
		aluno.setMatricula(scan.next());

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite a diciplina: ");
			aluno.getDiciplinas()[i] = scan.next();
			System.out.print("Digite a nota: ");
			aluno.getNotas()[i] = scan.nextDouble();
		}
	
		aluno.boletim();
	}

}
