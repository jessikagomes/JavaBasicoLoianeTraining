package com.cursojava.aula46;

import com.cursojava.aula43exe.Animal;

public class Teste {

	public static void main(String[] args) {

		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triangulo");
		triangulo.setBase(10);
		triangulo.setAltura(20);
		
		Circulo circulo = new Circulo();
		circulo.setNome("Circulo");
		circulo.setRaio(20);

		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setLado(40);
		
		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setAltura(30);
		cilindro.setRaio(30);
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[4];
		figuras[0] = triangulo;
		figuras[1] = circulo;
		figuras[2] = quadrado;
		figuras[3] = cilindro;

		System.out.println("Figuras:");
		System.out.println("-----------------");
		for (FiguraGeometrica figura : figuras) {
			System.out.println(figura);
			System.out.println("-----------------");
		}
	}

}
