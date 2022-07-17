package br.com.abn.model;

public class Conta {
	
	private long numero;
	private double saldo;
	
	public Conta() {

	}	
	
	public Conta(long numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public long getNumero() {
		return numero;
	}
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
