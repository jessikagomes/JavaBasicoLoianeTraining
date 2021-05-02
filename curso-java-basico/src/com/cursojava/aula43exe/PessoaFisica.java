package com.cursojava.aula43exe;

public class PessoaFisica extends Contribuinte{

	public double calcularImposto() {
		if(super.getRenda() <= 1400 ) {
			super.setImposto(0);
		}else if(super.getRenda() >1400 && super.getRenda() <= 2100) {
			super.setImposto(super.getRenda() * 0.10);
		}else if(super.getRenda() >2100 && super.getRenda() <= 2800) {
			super.setImposto(super.getRenda() * 0.15);
		}else if(super.getRenda() >2800 && super.getRenda() <= 3600) {
			super.setImposto(super.getRenda() * 0.25);
		}else {
			super.setImposto(super.getRenda() * 0.30);
		}		
		return super.getImposto();		
	}
}
