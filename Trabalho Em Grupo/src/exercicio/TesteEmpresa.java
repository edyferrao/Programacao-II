package exercicio;

import javax.swing.JOptionPane;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		Funcionario [] lista = new Funcionario[3];
		Funcionario func1 = new Gerente("Edilson", 10000);
		Funcionario func2 = new Vendedor("Raul", 5000, 1000);
		Funcionario func3 = new Atendente("Walter", 20000);
		
		Empresa empresa = new Empresa();
		
		lista[0] = func1;
		lista[1] = func2;
		lista[2] = func3;
		
		for (int i = 0; i < lista.length; i++) {
			lista[i].calcularPagamento(lista[i].salarioBase);
			JOptionPane.showMessageDialog(null, lista[i].toString());
			empresa.calcularFolhaPagamento(lista[i]);
		}
		
		JOptionPane.showMessageDialog(null, empresa.toString());

	}

}
