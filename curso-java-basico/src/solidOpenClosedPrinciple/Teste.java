package solidOpenClosedPrinciple;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DescontoLivroInfantil livroinfantil = new DescontoLivroInfantil();
		int livroValor = 100;
		
		System.out.println(livroValor - (livroinfantil.desconto()));

	}

}
