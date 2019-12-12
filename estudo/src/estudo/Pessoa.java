package estudo;

public class Pessoa {

	private int idade;
	private String nome;
	private long cpf;
	
	@Override
	public int hashCode() {
		return Long.valueOf(this.cpf).intValue();
	}

	@Override
	public boolean equals(Object obj) {
		Pessoa outro = (Pessoa) obj;
		boolean saoIguais = false;
		
		if (outro == this) {
			saoIguais = true;
		} else {
			if (outro.cpf == this.cpf) {
				saoIguais = true;
			}
		}

		return saoIguais;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

}
