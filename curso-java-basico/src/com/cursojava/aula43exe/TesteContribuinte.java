package com.cursojava.aula43exe;

import java.util.Scanner;

public class TesteContribuinte {

	public static void main(String[] args) {

		PessoaJuridica pj1 = new PessoaJuridica();
		PessoaJuridica pj2 = new PessoaJuridica();
		PessoaJuridica pj3 = new PessoaJuridica();
		PessoaFisica pf1 = new PessoaFisica();
		PessoaFisica pf2 = new PessoaFisica();
		PessoaFisica pf3 = new PessoaFisica();
		Scanner scan = new Scanner(System.in);

		pf1.setNome("Cliente 1");
		pf1.setRenda(2500);
		pf1.calcularImposto();
		System.out.println(pf1);

		System.out.println("-----------");

		pf2.setNome("Cliente 2");
		pf2.setRenda(1400);
		pf2.calcularImposto();
		System.out.println(pf2);
		
		System.out.println("-----------");

		pf3.setNome("Cliente 3");
		pf3.setRenda(4000);
		pf3.calcularImposto();
		System.out.println(pf3);
		
		System.out.println("-----------");

		pj1.setNome("Cliente 4");
		pj1.setRenda(4000);
		pj1.calcularImposto();
		System.out.println(pj1);
		
		System.out.println("-----------");

		pj2.setNome("Cliente 5");
		pj2.setRenda(3500);
		pj2.calcularImposto();
		System.out.println(pj2);
		
		System.out.println("-----------");

		pj3.setNome("Cliente 6");
		pj3.setRenda(2000);
		pj3.calcularImposto();
		System.out.println(pj3);
	}

}
