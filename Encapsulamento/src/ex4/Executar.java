package ex4;

public class Executar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Edilson");
		pessoa.setIdade(23);
		pessoa.setAltura(1.92);
		
		System.out.println(pessoa.getNome()+" tem: "+pessoa.getIdade()+" anos e tem: "+pessoa.getAltura()+" metros de altura");
		

	}

}
