package works.alga.estudos.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("joão", 22);
		Pessoa p2 = new Pessoa("adriana", 23);
		Pessoa p3 = new Pessoa("bruno", 21);

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		Collections.sort(pessoas);
		/*
		 * esse erro de compilacao acontece porque o java so consegue ordenar se
		 * tivermos a ordenação definida na classe pessoa. o metodo sort espera uma
		 * lista de uma classe que implementa a interface comparable.
		 * entao se adicionarmos o implements comparabe na classe pessoa
		 * o sort ira funcionar
		 */

		for (Pessoa p : pessoas) {
			System.out.println(p);
		}

	}

}
