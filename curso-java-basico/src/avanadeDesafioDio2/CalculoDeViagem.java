package avanadeDesafioDio2;

import java.util.Scanner;

public class CalculoDeViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue a solucao

		Scanner scan = new Scanner(System.in);
			
		int horas, velocidade;
		horas = scan.nextInt();
		velocidade = scan.nextInt();
		
		System.out.printf("%.3f\n", (horas * velocidade)/12.0);
	}

}
