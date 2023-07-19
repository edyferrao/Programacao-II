package ex7;

import java.util.*;

public class Impar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um nome: ");
		String nome = input.next();
		String novoNome = "";
		char [] v = nome.toCharArray();
		for (int i = 0; i < v.length; i++) {
			if (i % 2 != 0) {
				v[i] = nome.charAt(i);
				System.out.println(Arrays.toString(v));
			}
		}
		System.out.println(novoNome);

	}

}
