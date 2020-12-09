package br.ufpe.cinmoto.ga_tutorial.banco;

public class SaldoNaoSuficienteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SaldoNaoSuficienteException(String string) {
		super(string);
	}

}