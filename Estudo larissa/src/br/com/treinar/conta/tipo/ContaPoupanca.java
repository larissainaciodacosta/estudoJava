package br.com.treinar.conta.tipo;

import br.com.treinar.conta.Conta;

public class ContaPoupanca extends Conta {

	private int taxaRendimento;

	public int getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(int taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

}
