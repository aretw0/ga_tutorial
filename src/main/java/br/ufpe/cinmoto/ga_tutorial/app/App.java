package br.ufpe.cinmoto.ga_tutorial.app;

import br.ufpe.cinmoto.ga_tutorial.banco.Conta;
import br.ufpe.cinmoto.ga_tutorial.banco.SaldoNaoSuficienteException;
import br.ufpe.cinmoto.ga_tutorial.banco.TransferenciaException;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("TEST BANK" );
        
        System.out.println("\n\nRegular Flow:" );
        
        System.out.println("\nCreation (1000, 200)");
        Conta testWallet = new Conta("Test Wallet", 1000, 200);
        testWallet.imprimeDados();
        
        System.out.println("\nTransfer (500)");
        testWallet.transferenciaDoc(500);
        testWallet.imprimeDados();
        
        System.out.println("\nPayment (600)");
        testWallet.pagarConta(600);
        testWallet.imprimeDados();
        
        System.out.println("\nDeposit (2000)");
        testWallet.deposito(2000);
        testWallet.imprimeDados();
        
        System.out.println("\nWithdraw (2000)");
        testWallet.saque(2000);
        testWallet.imprimeDados();
        
        
        System.out.println("\n\nExceptions");
        
        System.out.println("\nPayment (200)");
        try {
        	testWallet.pagarConta(200);
        	System.out.println("Should raise exception");
		} catch (SaldoNaoSuficienteException e) {
			System.out.println(e.getMessage());
		} finally {
			testWallet.imprimeDados();
		}
        
        System.out.println("\nWithdraw (100)");
        try {
        	testWallet.saque(100);
        	System.out.println("Should raise exception");
		} catch (SaldoNaoSuficienteException e) {
			System.out.println(e.getMessage());
		} finally {
			testWallet.imprimeDados();
		}
        
        System.out.println("\nTransfer (501)");
        try {
        	testWallet.transferenciaDoc(501);
        	System.out.println("Should raise exception");
		} catch (TransferenciaException e) {
			System.out.println(e.getMessage());
		} finally {
			testWallet.imprimeDados();
		}
        
        
    }
}
