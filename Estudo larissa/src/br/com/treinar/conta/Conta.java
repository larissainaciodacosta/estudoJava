package br.com.treinar.conta;

import br.com.treinar.conta.tipo.IProduto;

public abstract class Conta implements IProduto {

	private double saldo;
	private String cliente;
	private int numero;

	public abstract void depositar(double valor);

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
