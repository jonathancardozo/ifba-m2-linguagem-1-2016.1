package Metodos;

public class Metodos {

	public static void main(String[] args) {
		imprimirOlaMundo();
		
		imprimirOlaFulano("João");
		imprimirOlaFulano("José");
		imprimirOlaFulano("Jonathan");
		
		String frase;
		frase = retornaOlaVoce("Jonathan");
		//System.out.println(frase);
		bomDia(frase);
		
		//bomDia("Jonathan");
		
		somar(1,1);
		
		
	}
	
	public static void imprimirOlaMundo() {
		System.out.println("Ola Mundo!");
	}
	
	public static void imprimirOlaFulano(String nome){
		System.out.println("Ola " + nome + "!");
	}
	
	public static String retornaOlaVoce(String nome){
		return "Ola " + nome + "!";
	}
	
	public static void bomDia(String texto){
		System.out.println(texto + " Bom Dia!");
	}
	
	/*
	 * Um método que exija 2 argumentos inteiros e imprima o resutlado da soma desses argumentos
	 * somar()
	 * 
	 * */
	
	public static void somar(int x, int y){
		int resultado = x + y;
		System.out.println(resultado);
	}
	
	// Método Multiplicação

}
