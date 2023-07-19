package ex2;

public class Start {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.id = 1;
		p.nome = "Edilson";
		p.idade = 24;
		p.nacionalidade = "Mocambicana";
		System.out.println(p.nome); 
		Pessoa.imprimiDadosPessoa(p);
		;

	}

}
