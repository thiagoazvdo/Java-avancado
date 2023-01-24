package works.alga.estudos.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("joão");
		Aluno a2 = new Aluno("maria");
		Aluno a3 = new Aluno("jose");
		Aluno a4 = new Aluno("pedro");

		/*
		 * o hashset eh um conjunto onde colocamos referencia aos objetos. em um hashset
		 * nao se podemos repetir um objeto. obs: nao dá erro, a estrutura de dados
		 * apenas nao aceita e compila normalmente.
		 */
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);

		imprimirAlunos(alunos);
		/*
		 * podemos observar que o hashset nao utilizou a sequencia da instanciacao dos
		 * objetos ou alguma ordem especifica. ou seja se precisarmos de algum tipo de
		 * ordenação usamos o arraylist
		 */

	}

	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("nome: " + a.getNome());
		}
		/*
		 * como nao tem uma ordem de posição, nao temos como o getIndex()
		 */
	}
}
