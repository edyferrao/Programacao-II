package arranca;

import base.Conta;
import logica.Cliente;

public class Executa {

	public static void main(String[] args) {
		
		Cliente desonesto = new Cliente();
		Cliente honesto = new Cliente();
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		desonesto.setId(1);
		desonesto.setNome("Edilson");
		desonesto.setSexo('M');
		
		honesto.setId(2);
		honesto.setNome("Mirna");
		honesto.setSexo('F');
		
		conta1.setId(123);
		conta1.setNome("cc");
		conta1.setSaldo(100);
		conta1.setCl(desonesto);
		
		conta2.setId(1234);
		conta2.setNome("cc");
		conta2.setSaldo(2000);
		conta2.setCl(honesto);
		
		conta1.imprimir();
		conta2.imprimir();
		
		conta1.setId(1234);
		conta2.setId(123);
		
		conta1.imprimir();
		conta2.imprimir();

	}

}
