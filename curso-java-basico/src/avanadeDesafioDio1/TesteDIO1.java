package avanadeDesafioDio1;

import java.util.Scanner;

public class TesteDIO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = 0;
		n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			if(i %2 == 0) System.out.println(i);
		}
	}

}
