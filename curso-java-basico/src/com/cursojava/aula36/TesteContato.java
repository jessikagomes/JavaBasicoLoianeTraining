package com.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();
		Endereco end = new Endereco();
		Telefone tel = new Telefone();
		Telefone tel2 = new Telefone();
		
		end.setNomeRua("Rua Brasil");
		end.setNumero("23");		
		end.setCep("21353159");
		end.setCidade("Taubate");
		end.setEstado("Sao Paulo");
		
		tel.setTipo("Casa");
		tel.setDdd("12");
		tel.setNumero("9593595395");
		tel2.setTipo("Celular");
		tel2.setDdd("12");
		tel2.setNumero("50502020");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;

		contato.setNome("Juliana");
		contato.setEndereco(end);
		contato.setTelefones(telefones);
		
		
		System.out.println(contato.getNome());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getNomeRua());
		}
		
		if (contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
			System.out.println(t.getDdd() +" " + t.getNumero());
		}
		}
		
	}
}
