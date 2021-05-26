package com.cursojava.aula62;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Valor valor1 = new Valor();
        int valor2 = 10;
        
        System.out.println("\nAntes do metodo");
        System.out.println("Valor1 (Objeto): "+ valor1.getValor());
        System.out.println("Valor2 (Primitivo): "+ valor2);
        
        soma1(valor1, valor2);

        System.out.println("\nDepois do metodo");
        System.out.println("Valor1 (Objeto): "+ valor1.getValor());
        System.out.println("Valor2 (Primitivo): "+ valor2);
        
    }
    
    public static void soma1(Valor valor1, int valor2) {
        valor1.setValor(10);
        valor2 = 20;
        
        System.out.println("\nDentro do metodo");
        System.out.println("Valor1 (Objeto): " + valor1.getValor());
        System.out.println("Valor2 (Primitivo): " + valor2);
        int soma = valor1.getValor() + valor2;
        
        System.out.println("Soma = " + soma);
    }

}
