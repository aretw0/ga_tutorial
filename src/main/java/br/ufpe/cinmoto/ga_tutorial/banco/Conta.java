package br.ufpe.cinmoto.ga_tutorial.banco;

public class Conta {

	private String nome;
	private int saldo;
	private int credito;

	public Conta(String nome, int saldo, int credito) {
		this.nome = nome;
		this.saldo = saldo;
		this.credito = credito;
	}

	public void saque(int valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
		} else {
			throw new SaldoNaoSuficienteException("Você não possui saldo suficiente");
		}
	}

	public void deposito(int valor) {
		saldo = saldo + valor;
	}
	
	public void transferenciaDoc(int valor) {
		if (valor > 500) {
			throw new TransferenciaException("Valor máximo para transferência DOC: R$ 5.000,00");
		}
		saldo = saldo - valor;
	}
	
	public void pagarConta(int valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
		} else if (saldo + credito >= valor) {
			credito = credito - valor;
			credito = credito + saldo;
			saldo = 0;
		} else {
			throw new SaldoNaoSuficienteException("Você não possui saldo nem crédito suficientes");
		}
	}
	
	public int saldo() {
		return saldo;
	}
	
	public int credito() {
		return credito;
	}
	
	public void imprimeDados() {
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Saldo = " + saldo);
		System.out.println("Crédito = " + credito);
	}

}