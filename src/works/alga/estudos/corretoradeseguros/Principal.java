package works.alga.estudos.corretoradeseguros;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000, 2012);
		Imovel minhaCasa = new Imovel(92000, 320);
		Barco barco = new Barco(2020, 350000);
		Notebook notebook = new Notebook(2022, 8000);
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(barco);
		corretora.fazerPropostaSeguro(notebook);
		
	}

}
