package works.alga.estudos.documentacao;

public class Teste {
//Observar exemplo na classe Funcionario a documentacao no ultimo metodo
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Thiago Azevedo", 5500);
		//a pre-visualizacao da chamada do metodo (quadrinho da direita) adiantamentoViagem tem a explicacao ja que criamos a documentacao
		funcionario.adiantamentoViagem(15, true);
		System.out.println(funcionario.adiantamentoViagem(15, true));

		//para gerar o javadoc vamos em project > generate javadoc 
		//obs: o javadoc nao aceita acentuacao
	}
}
