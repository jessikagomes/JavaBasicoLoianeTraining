package com.cursojava.aula63;

public class ExmploPrintf {

	public static void main(String[] args) {

		//formata valores usando Varargs
		//%[flags][largura][.precisao] caractere-de-conversao
		System.out.printf("Hello %s", "Olá Mundo");
		System.out.println();
		System.out.printf("Hello %S", "Olá Mundo");
		System.out.println();
		System.out.printf("%c", 'c');
		System.out.printf("%n");
		
		int valor = 123456789;
		int valor2 = -234567891;
		System.out.printf("%d", valor);//imprime um inteiro
		System.out.printf("%n");
		System.out.printf("%+d", valor);//imprime o sinal positivo ou negativo do numero 
		System.out.printf("%n");
		System.out.printf("% d", valor2);//imprime o sinal negativo do numero 
		System.out.printf("%n");
		System.out.printf("% d", valor);//imprime espaço em branco se o numero for positivo
		System.out.printf("%n");
		System.out.printf("%015d", valor); //completa com 0 os espaços para completar 15 caracteres
		System.out.printf("%n");
		System.out.printf("%,d", valor);//coloca ponto a cada 3 casas
		System.out.printf("%n");
		
		double pontoFlutuante = 3.5458595966;
		System.out.printf("%f", pontoFlutuante);
		System.out.printf("%n");
		System.out.printf("%.2f", pontoFlutuante); //casas decimais
		System.out.printf("%n");
		System.out.printf("R$%10.2f", pontoFlutuante); //adiciona R$ coloca o range de 10 caracteres e coloca 2 casas decimais após o ponto
		System.out.printf("%n");
		
		String olaMundo = "Ola Mundo!";
		System.out.printf("%20s", olaMundo);//completa 20 espaços iniciando na esquerda
		System.out.printf("%n");
		System.out.printf("%-20s", olaMundo);//completa com 20 espaços
		System.out.printf("%n");
		
		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto() {
		double[] precos = {10000, 123.54, 7843.567,1, 4.56789};
		
		for(int i = 0; i< precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n","Item", i+1, precos[i]);
		}
		//Java.util.Formater
	}

}
