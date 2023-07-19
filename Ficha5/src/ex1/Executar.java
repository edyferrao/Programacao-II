package ex1;

public class Executar {

	public static void main(String [] args) {
		
		Normal normal = new Normal();
		VIP vip = new VIP();
		CamaroteSuperior camSup = new CamaroteSuperior();
		CamaroteInferior camInf = new CamaroteInferior();
		
		normal.valor = 1200;
		normal.imprimeValor();
		normal.imprimirBilhete();
		
		vip.valor = 2000;
		vip.valorAdicional = 500;
		System.out.println("O bilhete VIP custa: "+vip.bilheteVIP());
		
		camSup.valor = 500;
		camSup.valorAdicional = 500;
		camSup.setValorVipAdicional(900);
		System.out.println("O valor do camarote VIP Superior e de: "+camSup.camSup());
		
		camInf.valor = 600;
		camInf.setLocalização("Tchumene");
		camInf.imprimirLocalização();

	}

}
