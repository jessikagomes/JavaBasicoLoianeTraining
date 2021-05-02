package com.cursojava.aula43exe;

public class PessoaJuridica extends Contribuinte{
	
	public double calcularImposto() {
		super.setImposto(super.getRenda() * 0.10) ;
		return super.getImposto();		
	}

}
