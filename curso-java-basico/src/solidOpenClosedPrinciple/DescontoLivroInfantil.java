package solidOpenClosedPrinciple;

public class DescontoLivroInfantil implements DescontoLivro{

	@Override
	public double desconto() {
		return 0.2;
	}

}
