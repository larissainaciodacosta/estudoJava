package estudo;

import java.util.HashSet;
import java.util.Set;

public class TesteArraySet {

	public static void main(String[] args) {
		
		Set<Pessoa> pessoas = new HashSet<Pessoa>();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("larissa");
		p1.setIdade(29);
		p1.setCpf(555);
		
		Pessoa p2 = p1;
		
		Pessoa p3 = new Pessoa();
		p3.setNome("larissa");
		p3.setIdade(29);
		p3.setCpf(333);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p1);
		
		System.out.println("Quantidad de pessoas: " + pessoas.size());
		
		
		
	}
	
}