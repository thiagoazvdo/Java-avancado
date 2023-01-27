package works.alga.estudos.generics;

import java.util.List;

public class RetiraElementos {
	
/*	public static Object recuperaPrimeiro(List lista) {
		return lista.get(0);
	}
*/	
	public static <T> T recuperaPrimeiro(List<T> lista) {
		return lista.get(0);
	}

}
