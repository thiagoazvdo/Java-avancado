package works.alga.estudos.impressaointerface;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * ");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * * * * ");
		System.out.println(imprimivel.getCoproPagina());
		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - ");
		System.out.println("                  EPSON                 ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - ");

	}

}
