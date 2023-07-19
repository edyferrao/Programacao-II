package exercicios;

import java.util.Vector;

public class Numeros {
	
	
	Vector <Integer> v = new Vector <Integer> ();
	
	

	public void adicionar(int n) {
		v.add(n);
	}
	
	public void ordenar() {
		for (int i = 0; i < v.size(); i++) {
			for (int j = 0; j < v.size(); j++) {
				if (v.elementAt(i) > v.elementAt(j)) {
					int temp = v.elementAt(i);
					v.set(i, v.elementAt(j));
					v.set(j, temp);
				}
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
	}
}
