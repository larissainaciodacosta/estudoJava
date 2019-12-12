package estudo;

public class TesteEqualsAndHashCode {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("larissa");
		p1.setIdade(29);
		p1.setCpf(555);
		
		Pessoa p2 = p1;
		
		Pessoa p3 = new Pessoa();
		p3.setNome("larissa");
		p3.setIdade(29);
		p3.setCpf(555);
		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));
		
	}
	
}
