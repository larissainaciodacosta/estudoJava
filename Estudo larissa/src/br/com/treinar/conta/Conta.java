package br.com.treinar.conta;

import br.com.treinar.conta.tipo.IProduto;

public abstract class Conta implements IProduto {

	private double saldo;
	private String cliente;
	private int numero;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean saoIguais = false;
		if (this == obj) {
			saoIguais = true;
		} else {
			if (obj == null) {
				saoIguais = false;
			} else {
				if (getClass() != obj.getClass()) {
					saoIguais = false;
				} else {
					Conta other = (Conta) obj;
					if (numero != other.numero) {
						saoIguais = false;
					}
				}
			}
		}
		return saoIguais;
	}

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
	
	@Override
	public String toString() {
		return "Numero: " + numero;
	}

}
