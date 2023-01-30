package works.alga.estudos.dbug;

public class Fibonacci {

	// F(n) = F(n-1) + F(n-2)
	// 1, 1, 2, 3, 5, 8 ...
	public static long calcula(long posicao) {
		if (posicao == 0 || posicao == 1) {
			return posicao;
		}
		long valor = calcula(posicao - 1) + calcula(posicao - 2);
		return valor;
	}

}
