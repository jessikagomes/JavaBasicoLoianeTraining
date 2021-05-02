package com.cursojava.aula20;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador 1 = x");
		System.out.println("Jogador 2 = o");

		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;

		// enquanto ningu�m ganhou a gente continua o jogo
		while (!ganhou) {

			if (jogada % 2 == 1) { // jogador 1
				System.out.println("Vez do jogador 1. Escolha linha e coluna [1-3]");
				sinal = 'x';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna [1-3]");
				sinal = 'o';
			}
			
			

			boolean linhaValida = false;
			while (!linhaValida) { // enquanto n�o escolhar uma linha v�lida continua perguntando
				System.out.println("Entre com a linha [1-3]");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Linha inv�lida, tente novamente! ");
				}
			}

			boolean colunaValida = false;
			while (!colunaValida) {// enquanto n�o escolher uma coluna v�lida continua perguntando
				System.out.println("Entre com a coluna [1-3]");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Coluna inv�lida, tente novamente! ");
				}
			}
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'x' || jogoVelha[linha][coluna] == 'o') {
				System.out.println("Posi��o j� usada, tente novamente! ");
			} else { // jogada v�lida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}
			// imprimir tabuleiro
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}

			// verificar se tem ganhador
			if ((jogoVelha[0][0] == 'x' && jogoVelha[0][1] == 'x' && jogoVelha[0][2] == 'x') || // linha 1
					(jogoVelha[1][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[1][2] == 'x') || // linha 2
					(jogoVelha[2][0] == 'x' && jogoVelha[2][1] == 'x' && jogoVelha[2][2] == 'x') || // linha 3
					(jogoVelha[0][0] == 'x' && jogoVelha[1][0] == 'x' && jogoVelha[2][0] == 'x') || // coluna 1
					(jogoVelha[0][1] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][1] == 'x') || // coluna 2
					(jogoVelha[0][2] == 'x' && jogoVelha[1][2] == 'x' && jogoVelha[2][2] == 'x') || // coluna 3
					(jogoVelha[0][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][2] == 'x') || // diagonal
					(jogoVelha[0][2] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][0] == 'x')) { //diagonal 2
				ganhou = true;
				System.out.print("Parab�ns, jogador 1 ganhou!");
			} else if ((jogoVelha[0][0] == 'o' && jogoVelha[0][1] == 'o' && jogoVelha[0][2] == 'x') || // linha 1
					(jogoVelha[1][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[1][2] == 'x') || // linha 2
					(jogoVelha[2][0] == 'o' && jogoVelha[2][1] == 'o' && jogoVelha[2][2] == 'x') || // linha 3
					(jogoVelha[0][0] == 'o' && jogoVelha[1][0] == 'o' && jogoVelha[2][0] == 'x') || // coluna 1
					(jogoVelha[0][1] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][1] == 'x') || // coluna 2
					(jogoVelha[0][2] == 'o' && jogoVelha[1][2] == 'o' && jogoVelha[2][2] == 'x') || // coluna 3
					(jogoVelha[0][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][2] == 'x') || // diagonal
					(jogoVelha[0][2] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][0] == 'x')) { //diagonal 2
					ganhou = true;
				System.out.print("Parab�ns, jogador 2 ganhou!");
			} else if (jogada > 9) {
				ganhou = true;
				System.out.print("Ningu�m ganhou essa partida!");
			}

		}

	}
}
