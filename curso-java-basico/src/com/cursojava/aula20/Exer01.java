package com.cursojava.aula20;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		
		int [][] numAleatorios = new int [4][4];
		
		Random ran = new Random();
				
		for(int i=0; i<numAleatorios.length; i++) {
			for(int j=0; j < numAleatorios[i].length; j++) {
				numAleatorios[i][j]= ran.nextInt(9);
			}
		}
		
		for(int i=0; i<numAleatorios.length; i++) {
			for(int j=0; j < numAleatorios[i].length; j++) {
				System.out.print(numAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		
		for(int i=0; i<numAleatorios.length; i++) {
			for(int j=0; j < numAleatorios[i].length; j++) {
				if(numAleatorios[i][j] > maior) {
					maior = numAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		System.out.println("Maior Valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);
		
	}

}
