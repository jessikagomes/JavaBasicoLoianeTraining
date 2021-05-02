package com.cursojava.aula24exe;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();
		
		livroDeBiblioteca.titulo = "Amar e ser Livre";
		livroDeBiblioteca.editora = "Sextante";
		livroDeBiblioteca.autor = "Sri Prim Baba";
		livroDeBiblioteca.pag = 120;
		livroDeBiblioteca.emprestado = true;
		livroDeBiblioteca.dataEntrega = new Date();
	
	}

}
