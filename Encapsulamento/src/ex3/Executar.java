package ex3;

public class Executar {

	public static void main(String[] args) {
		
		Tempo t = new Tempo();
		 
		t.setHora(3);
		t.setMinuto(37);
		
		System.out.println("A hora e "+t.getHora()+":"+t.getMinuto());

	}

}
