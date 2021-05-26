package com.cursojava.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {
		
		System.out.println(Math.pow(2,3));
		System.out.println("Arredondamento round 2.7 = " + Math.round(2.7));
		System.out.println("Arredondamento round 2.4 = " + Math.round(2.4));
		System.out.println("Arredondamento ceil para cima 2.3 = " + Math.ceil(2.3));
		System.out.println("Arredondamento ceil para cima 2.7 = " + Math.ceil(2.7));
		System.out.println("Arredondamento floor para baixo 2.3 = " + Math.floor(2.3));
		System.out.println("Arredondamento floor para baixo 2.7 = " + Math.floor(2.7));
		System.out.println("Numero aleatório " + Math.random());
		System.out.println("Numero aleatório de 0 a 10 = " + Math.round(Math.random()*10));
		System.out.println("Numero aleatório de 0 a 100 = " + Math.round(Math.random()*100));
		System.out.println("Seno de 30 = " + Math.sin(Math.toRadians(30)));//traz em radiano então convertemos para graus



	}

}
