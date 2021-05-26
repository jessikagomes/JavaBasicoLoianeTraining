package com.cursojava.aula75_84;

public class Aula82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alfabeto = String.join(",","A", "B","C","D");
		System.out.println(alfabeto);

		String [] letras = alfabeto.split(",");
		for(String letra : letras) {
		System.out.println(letra);
		}

		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";");
		for(String info : infos) {
			System.out.println(info);
			}
		}

}
