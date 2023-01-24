package works.alga.estudos.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("joão");
		Aluno a2 = new Aluno("maria");
		Aluno a3 = new Aluno("jose");
		Aluno a4 = new Aluno("pedro");

		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		/*
		 * Map (interface) HashMap(classe). o hashmap eh composto de um array e um
		 * conjunto onde estao os objetos. eles fazem uma chave para um objeto.
		 */

		// para inserir valores no hashmap usamos o put();

		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);
		alunos.put("5", a4);

		/*
		 * obviamente nao podemos ter chaves repetidas mas podemos ter mais de uma chave
		 * para o mesmo objeto
		 */

		imprimirAlunos(alunos);
		
		//outro exemplo para entender melhor o hashmap
		Aluno alunoRecuperado = alunos.get("3");
		System.out.println("aluno(a) de chave 3 é o(a): " + alunoRecuperado.getNome());
		/*como temos chave e valor podemos recuperar o valor pela chave ou visse e versa
		 * sem precisar percorrer a estrutura de dados no caso de um arraylist por exemplo*/

	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("nome : " + a.getNome());
		}
	}

}
