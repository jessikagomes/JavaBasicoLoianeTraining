package com.cursojava.aula52exe;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();

		int opcao = 1;
		while (opcao != 3) {
			opcao = obterOpcaoMenu(scan);

			if (opcao == 1) {
				consultarContato(scan, agenda);
			} else if (opcao == 2) {
				adicionarContato(scan, agenda);
			}
		}

	}

	public static void adicionarContato(Scanner scan, Agenda agenda) {
		System.out.println("Criando um contato, entre com as informações");
		String nome = LerInfoString(scan, "Entre com o nome do contato: ");
		String telefone = LerInfoString(scan, "Entre com o telefone do contato: ");
		String email = LerInfoString(scan, "Entre com o email do contato: ");

		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);

		System.out.println("Contato a ser criado:");
		System.out.println(contato);

		try {
			agenda.Adicionar(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("----Contatos da Agenda-----");
			System.out.println(agenda);
		}

	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = LerInfoString(scan, "entre com o" + " nome do contato a ser pesquisado");
		try {
			if (agenda.consultar(nomeContato) >= 0) {
				System.out.println("Contato Existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String LerInfoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 3;
		while (!entradaValida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Consultar ");
			System.out.println("2 - Adicionar");
			System.out.println("3 - Sair");

			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;

				} else {
					throw new Exception("entrada inválida");
				}
			} catch (Exception e) {
				System.out.println("Entrada Invalidade digite novamente\n");
			}

		}
		return opcao;
	}

}
