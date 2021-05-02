package com.cursojava.aula36exe;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato contatos[]= new Contato[3];

		System.out.println("Digite o nome da agenda: ");
		agenda.setNomeAgenda(scan.nextLine());
		System.out.println("Sua agenda chama-se Agenda " + agenda.getNomeAgenda());
		
		for(int i=0;i< 3; i++) {
			System.out.println("Digite as infos do " + (i+1) + "o contato:");
			Contato c = new Contato();
			System.out.println("Nome: ");
			c.setNome(scan.nextLine());
			System.out.println("Telefone: ");
			c.setTelefone(scan.nextLine());
			System.out.println("Email: ");
			c.setEmail(scan.nextLine());
			
			contatos[i] = c;
		}
		
		agenda.setContato(contatos);
		
		System.out.println(agenda.obterInfo());

	}

}
