package works.alga.estudos.impressaointerface;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * ");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("* * * * * * * * * * * * * * * * * * * * ");
		System.out.println(imprimivel.getCoproPagina());
		System.out.println();
		System.out.println("- - - - - - - - - - - - - - - - - - - - ");
		System.out.println("                  HP                 ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - ");

		
	}

}
