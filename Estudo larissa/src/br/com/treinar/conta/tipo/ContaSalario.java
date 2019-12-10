package br.com.treinar.conta.tipo;

import br.com.treinar.conta.Conta;

public class ContaSalario extends Conta {

	private int diaPagamento;

	public int getDiaPagamento() {
		return diaPagamento;
	}

	public void setDiaPagamento(int diaPagamento) {
		this.diaPagamento = diaPagamento;
	}

}
