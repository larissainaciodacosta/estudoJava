package estudo;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("larissa");
		p1.setIdade(29);
		p1.setCpf(555);
		
		Pessoa p2 = p1;
		
		Pessoa p3 = new Pessoa();
		p3.setNome("larissa");
		p3.setIdade(29);
		p3.setCpf(555);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p1);
		
		System.out.println("Quantidad de pessoas: " + pessoas.size());
		
		
		
	}
	
}
