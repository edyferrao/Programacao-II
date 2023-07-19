package pessoa;

public class Executar {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante ();
		Trabalhador trabalhador = new Trabalhador();
		
		estudante.setNome("Edilson");
		estudante.setEndereço("Tchumene 2");
		estudante.setAnoEscolar(2);
		estudante.comer();
		estudante.dormir();
		estudante.estudar();
		estudante.matricular();
		
		trabalhador.setNome("Dorce");
		trabalhador.setEndereço("Matola A");
		trabalhador.setCategoria("Contabilista");
		trabalhador.setFunção("Contar");
		trabalhador.comer();
		trabalhador.dormir();
		trabalhador.trabalhar();
		trabalhador.porCartão();
	}

}
