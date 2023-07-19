package exercicios;

//import java.util.Vector;

public class ExecutarNumeros {

	public static void main(String[] args) {
		
		Numeros nums = new Numeros();
		
		//Vector <Integer> v = new Vector <Integer> ();
		
			nums.adicionar(5);
			nums.adicionar(2);
			nums.adicionar(1);
			nums.adicionar(60);
			
		nums.ordenar();
		nums.imprimir();
	}

}
