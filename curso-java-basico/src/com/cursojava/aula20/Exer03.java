package com.cursojava.aula20;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Entre com o valor da posição ["+i+","+j+"]: ");
				matriz[i][j] = scan.nextInt();
			}
		}
		System.out.println("------MATRIZ-----");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		int par = 0;
		int impar = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
		}
		System.out.println("-------------------------------");
		System.out.println("Número de PARES na Matriz: " + par);
		System.out.println("Número de ÍMPARES na Matriz: " + impar);
	}
}
