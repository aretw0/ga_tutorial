package br.ufpe.cinmoto.ga_tutorial.banco;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ContaTest {

	Conta conta;
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Before
	public void initConta() {
		conta = new Conta("user", 50, 100);
	}
	
	@Test
	public void testDeposito() {
		conta.deposito(50);
		assertEquals(100,  conta.saldo());
	}
	
	@Test
	public void testSaque() {
		conta.saque(30);
		assertEquals(20, conta.saldo());
		
		conta.saque(20);
		assertEquals(0, conta.saldo());
		
		conta.deposito(88);
		conta.saque(8);
		assertEquals(80, conta.saldo());
	}
	
	@Test
	public void testTransferencia() {
		conta.transferenciaDoc(25);
		assertEquals(25, conta.saldo());
		
		conta.transferenciaDoc(20);
		assertEquals(5, conta.saldo());
	}
	
	@Test
	public void testPagar() {
		conta.pagarConta(10);
		assertEquals(40, conta.saldo());
		
		conta.pagarConta(140);
		assertEquals(0, conta.saldo());
		assertEquals(0, conta.credito());
	}
	
	@Test
	public void testCredito() {
		assertEquals(100, conta.credito());
	}
	
	@Test(expected = SaldoNaoSuficienteException.class)
	public void testSaldoExcepetion() {
		conta.saque(100);
	}
	
	@Test(expected = SaldoNaoSuficienteException.class)
	public void testPagarExcepetion() {
		conta.pagarConta(500);
	}
	
	@Test(expected = TransferenciaException.class)
	public void testTransferenciaException() {
		conta.transferenciaDoc(501);
	}
	
	@Test
	public void testTransferenciaExceptionBoundary() {
		conta.transferenciaDoc(500);
		assertEquals(-450,  conta.saldo());
	}
	
	@Test
	public void testImprime() {
		conta.imprimeDados();
		String test = "Nome do cliente: user\nSaldo = 50\nCrédito = 100\n";
		
		assertEquals(test, systemOutRule.getLogWithNormalizedLineSeparator());
	
	}
	
}