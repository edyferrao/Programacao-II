package funcionario;

public class Executar {
	public static void main (String [] args) {
		
		//Funcionario f = new Funcionario ("Edilson","BI",1256845, 50000);
		//Vendedor v = new Vendedor("Edilson","BI",1256845, 50000, 0);
		//System.out.println(v);
		//System.out.println(f);
		//v.imprimir();
		//v.imprimir("Minha comissão");
		//v.vendas(3);
		//System.out.println(v.vendas(3, 10));
		//System.out.println(v.getSalario());
		
		Administradores a = new Administradores("Edilson", "Carta", 454215464, 15000, 0);
		System.out.println(a.calcularHorasExtras(4));
		System.out.println(a.getSalario());
		//System.err.println(a.getHorasExtras());
	}
}
