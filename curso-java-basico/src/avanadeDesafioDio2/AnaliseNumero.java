package avanadeDesafioDio2;

import java.util.Scanner;

public class AnaliseNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);

		// declare suas variaveis corretamente

		int par, impar, negativo, positivo, num;
		par = 0;
		impar = 0;
		negativo = 0;
		positivo = 0;

		for (int i = 0; i < 5; i++) {
			num = leitor.nextInt();
			if (num == 0) {
				par++;
			} else {
				if ((num % 2 == 0) && (num >= 1)) {
					par++;
					positivo++;
				} else if ((num % 2 == 0) && (num <= -1)) {
					par++;
					negativo++;
				} else if ((num % 2 != 0) && (num >= 1)) {
					impar++;
					positivo++;
				} else if ((num % 2 != 0) && (num <= -1)) {
					impar++;
					negativo++;
				}
			}
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
	}

	/*
	 * -5 0 -3 -4 12
	 * 
	 * 3 valor(es) par(es) 12 -4 0 2 valor(es) impar(es) -5 -3
	 * 
	 * 1 valor(es) positivo(s) 12 3 valor(es) negativo(s) -5 -3 -4
	 * 
	 * 
	 */
}
