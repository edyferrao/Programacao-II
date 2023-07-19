package ex6;

import java.util.Arrays;

public class Impar {

	public static void main(String[] args) {
		
		int [] v = {10, 2, 5, 25, 1, 3, 14};
		
		System.out.println(Arrays.toString(v));
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 != 0) {
				v[i] = v[i] + 1;
			}
		}
		System.out.println(Arrays.toString(v));

	}

}
