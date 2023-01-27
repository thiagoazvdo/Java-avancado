package works.alga.estudos.generics;

public class TesteGaveta {

	public static void main(String[] args) {
		Gaveta<String> gaveta = new Gaveta<>();
		//instanciando o objeto gaveta e informando que o tipo dessa gaveta especifica sera String
	
		gaveta.colocar("Livro de Java");
		
		System.out.println(gaveta.retirarPrimeiro());
		
		Gaveta<Integer> gavetaNumeros = new Gaveta<>();
		//instanciando mais um objeto gaveta e informando que o tipo dessa gaveta especifica sera Integer

		gavetaNumeros.colocar(5500);
		
		System.out.println(gavetaNumeros.retirarPrimeiro() + 1000);
		
		
	}
}
