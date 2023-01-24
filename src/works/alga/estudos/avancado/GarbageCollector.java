package works.alga.estudos.avancado;


public class GarbageCollector {
	
	public static void main(String[] args) {
		/*quando um objeto nao tem referencia remove o objeto para
		 * reduzir o uso inutilizado de memoria e melhorar o desempenho
		 * de um programa*/
		Carro carro = new Carro();
		carro.cor = "azul";
		
		carro = null;

		/*dessa forma temos que o carro perdeu sua referencia
		 * e uma vez que isso acontece o coletor de lixo pode
		 * atuar a qualquer momento, esse momento nao pode ser
		 * previsto, nao se sabe ao certo quando acontecerá
		*/
		
	}
	
}
