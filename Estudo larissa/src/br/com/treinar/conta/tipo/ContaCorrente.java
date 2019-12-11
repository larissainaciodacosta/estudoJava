package br.com.treinar.conta.tipo;

import br.com.treinar.conta.Conta;

public class ContaCorrente extends Conta implements IProduto {

	private double taxaManutencao;

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void depositar(double valor) {
		super.setSaldo((getSaldo() + valor) - 1);;
	}

	@Override
	public double calcularValor() {
		return taxaManutencao;
	}
	
}
