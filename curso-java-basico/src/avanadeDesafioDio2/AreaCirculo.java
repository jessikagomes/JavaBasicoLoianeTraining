package avanadeDesafioDio2;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		double area, raio;
        raio = scan.nextDouble();       //continue a solucao

		area = 3.14159 * (Math.pow(raio ,2));

		System.out.printf("A=%.4f\n", area);
	}

}
