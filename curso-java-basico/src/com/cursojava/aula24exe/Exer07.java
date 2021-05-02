package com.cursojava.aula24exe;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		aluno.diciplinas = new String[3];
		aluno.notas = new double[3];

		System.out.print("Digite o nome do aluno: ");
		aluno.nome = scan.next();

		System.out.print("Digite o Curso: ");
		aluno.curso = scan.next();

		System.out.print("Digite a Matricula: ");
		aluno.matricula = scan.next();

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite a diciplina: ");
			aluno.diciplinas[i] = scan.next();
			System.out.print("Digite a nota: ");
			aluno.notas[i] = scan.nextDouble();
		}
	
		

		aluno.boletim();
		
	}
}
