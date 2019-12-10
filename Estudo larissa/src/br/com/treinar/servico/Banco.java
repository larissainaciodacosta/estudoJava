package br.com.treinar.servico;

import java.util.Scanner;

import br.com.treinar.conta.Conta;
import br.com.treinar.conta.tipo.ContaCorrente;
import br.com.treinar.conta.tipo.ContaPoupanca;
import br.com.treinar.conta.tipo.ContaSalario;

public class Banco {
	
	private Scanner teclado = new Scanner(System.in);

	private void criarConta(Conta conta) {
		System.out.print("Infome o número da conta: ");
		conta.setNumero(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Informe o nome do cliente: ");
		conta.setCliente(teclado.nextLine());
	}
	
	private Conta criarConta() {
		
		Conta c = null;
		String menu = "Digite:\n\t1 - Conta Corrente\n\t2 - Conta Poupança\n\t3 - Conta Salario\n=> ";
		System.out.print(menu);
		int tipoConta = teclado.nextInt();
		teclado.nextLine();
		switch (tipoConta) {
		case 1:
			c = new ContaCorrente();
			criarConta(c);
			System.out.print("Informe o valor de taxa da manutenção: ");
			((ContaCorrente) c).setTaxaManutencao(teclado.nextInt());
			break;
		case 2:
			c = new ContaPoupanca();
			criarConta(c);
			System.out.print("Informe o valor de taxa da rendimento: ");
			((ContaPoupanca) c).setTaxaRendimento(teclado.nextInt());
			break;
		case 3:
			c = new ContaSalario();
			criarConta(c);
			System.out.print("Informe o dia do pagamento: ");
			((ContaSalario) c).setDiaPagamento(teclado.nextInt());
			break;
		default:
			System.out.println("Conta Inválida");
			break;
		}
		return c;
	}
	
	
	public void abrir() {
		int index = 0;
		Conta[] contas = new Conta[5];
		int opcao = 0;
		String menu = "Digite:\n\t0 - Sair\n\t1 - Criar conta\n\t2 - Depositar\n\t3 - Sacar\n=> ";
		
		do {
			System.out.print(menu);
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				contas[index++] = criarConta();
				break;
			case 2:
				System.out.println("DEPOSITAR");
				break;
			case 3:
				System.out.println("SACAR");
				break;
			case 0:
				System.out.println("SAIR");
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
				break;
			}
		} while (opcao != 0);
	}

}
