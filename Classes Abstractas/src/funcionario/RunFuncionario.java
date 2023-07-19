package funcionario;

public class RunFuncionario {

	public static void main(String[] args) {
		
		Vendedor v = new Vendedor("Edilson", "A225f553", 3000,500);
		Funcionario a = new Administrador("Antonio", "djn12454", 0, 0);
		//Funcionario f1 = new Funcionario("Mirna", "BS1151", 10000);
		Funcionario f = v;
		System.out.println(a);
		System.out.println(f);
		
	}

}
