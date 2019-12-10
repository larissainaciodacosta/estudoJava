package br.com.treinar.conta;

public abstract class Conta {

	private double saldo;
	private String cliente;
	private int numero;

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
