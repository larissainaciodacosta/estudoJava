package br.com.treinar.conta.tipo;

import br.com.treinar.conta.Conta;

public class ContaCorrente extends Conta {

	private double taxaManutencao;

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

}
