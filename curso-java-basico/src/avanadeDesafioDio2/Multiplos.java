package avanadeDesafioDio2;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		// continue a solucao
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		
		if (A == 0 || B == 0) {
			System.out.println("Sao Multiplos");
		} else if ((A > 0 && B > 0) ||(A < 0 && B > 0)||(A > 0 && B < 0)) {
			if (A > B) {
				if ((A % B) == 0) {
					System.out.println("Sao Multiplos");
				} else {
					System.out.println("Nao sao Multiplos");
				}
			} else if (B > A) {
				if ((B % A) == 0) {
					System.out.println("Sao Multiplos");
				} else {
					System.out.println("Nao sao Multiplos");
				}
			}
		} else {
			if (A > B) {
				if ((B % A) == 0) {
					System.out.println("Sao Multiplos");
				} else {
					System.out.println("Nao sao Multiplos");
				}
			} else if (B > A) {
				if ((A % B) == 0) {
					System.out.println("Sao Multiplos");
				} else {
					System.out.println("Nao sao Multiplos");
				}
			}
		}

	}
}
