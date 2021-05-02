package com.cursojava.aula36exe;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Curso curso = new Curso();
		Professor professor = new Professor();
		Aluno[] alunos = new Aluno[5];

		System.out.println("Entre com o nome do Curso: ");
		curso.setNomeCurso(scan.nextLine());

		System.out.println("Entre com o Horário: ");
		curso.setHorario(scan.nextLine());

		System.out.println("Entre com o nome do Professor: ");
		professor.setNomeProf(scan.nextLine());

		System.out.println("Entre com o Departamento: ");
		professor.setDepartamento(scan.nextLine());

		System.out.println("Entre com o Email: ");
		professor.setEmail(scan.nextLine());

		curso.setProfessor(professor);

		System.out.println("-----Alunos-----");

		for (int i = 0; i < 5; i++) {
			
			scan.nextLine();
			
			System.out.println("Nome aluno " + (i + 1) + ": ");
			String nome = scan.nextLine();
			
			System.out.println("Entre com a matricula: ");
			String mat = scan.nextLine();

			double[] notas = new double[4];

			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com a nota " + (j + 1) + ": ");
				notas[j] = scan.nextDouble();
			}

			Aluno aluno = new Aluno();
			aluno.setNomeAluno(nome);
			aluno.setMatricula(mat);
			aluno.setNotas(notas);

			alunos[i] = aluno;
		}

		curso.setAlunos(alunos);

		System.out.println(curso.obterInfo());
	}

}
