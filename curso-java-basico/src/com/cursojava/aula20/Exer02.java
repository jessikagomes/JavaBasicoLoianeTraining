package com.cursojava.aula20;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {

		int[][] numAleatorios = new int[10][10];

		Random ran = new Random();

		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				numAleatorios[i][j] = ran.nextInt(9);
			}
		}

		for (int i = 0; i < numAleatorios.length; i++) {
			for (int j = 0; j < numAleatorios[i].length; j++) {
				System.out.print(numAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		int maiorl5=0;
		int menorl5 = 10;
		int linha5 = 4;
		

		for (int i = 0; i < numAleatorios[linha5].length; i++) {
			if(numAleatorios[linha5][i] > maiorl5) {
				maiorl5 = numAleatorios[linha5][i];
			}
			if(numAleatorios[linha5][i] < menorl5) {
				menorl5 = numAleatorios[linha5][i];
			}
		}
		
		System.out.println("MAIOR numero da Linha 5: "+ maiorl5);
		System.out.println("MENOR numero da Linha 5: "+ menorl5);
		
		int maiorC7=0;
		int menorC7 = 10;
		int coluna7 = 6;
		for (int i = 0; i < numAleatorios.length; i++) { // anda pelas linhas
			if(numAleatorios[i][coluna7] > maiorC7) {
				maiorC7 = numAleatorios[i][coluna7];
			}
			if(numAleatorios[i][coluna7] < menorC7) {
				menorC7 = numAleatorios[i][coluna7];
			}
		}
		
		System.out.println("MAIOR numero da Coluna 7: "+ maiorC7);
		System.out.println("MENOR numero da Coluna 7: "+ menorC7);
	}

}
