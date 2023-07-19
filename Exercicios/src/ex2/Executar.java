package ex2;

public class Executar {

	public static void main(String[] args) {
		
		Veiculo bmw = new Carro(90);
		Veiculo suzuki = new Moto(50);
		
		System.out.println(bmw.acelerar());
		System.out.println(bmw.acelerar());
		System.out.println(bmw.frear());
		
		System.out.println(suzuki.frear());
		System.out.println(suzuki.frear());
		System.out.println(suzuki.acelerar());
	}

}
