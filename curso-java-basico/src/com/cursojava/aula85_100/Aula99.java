package com.cursojava.aula85_100;

import java.util.Random;

public class Aula99 {

	public static void main(String[] args) {

		System.out.println(Math.random());
		System.out.println(Math.floor(Math.random()*100));
		System.out.println(Math.random()*10);
		
		Random aleatorio = new Random();
		System.out.println(aleatorio.nextInt(100));

		


	}

}
