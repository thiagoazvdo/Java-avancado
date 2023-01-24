package works.alga.estudos.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("joão");
		Aluno a2 = new Aluno("maria");
		Aluno a3 = new Aluno("jose");
		Aluno a4 = new Aluno("pedro");

	/* diferente do array simples nós temos que informar
	 * a quantidade de posições*/
		
	/*	List alunos = new ArrayList();
		List = interface ----- ArrayList = classe que implementa
		//adicionando objetos ao ArrayList
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
	*/	
		
		/*aluno nesse caso poderia ser qualquer coisa, para isso
		 *foi criado o generics, com ele podemos informar que tipo
		 *de dados esse ArrayList vai receber, observe o exemplo anterior
		 *e perceba abaixo como ficaria informando o tipo de dado*/

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);

		
		imprimirAlunos(alunos);
		
		/*Relembrando : adicionando em um array simples - nesse caso
		o arraysimples só tem 4 posições */
		Aluno[] array = new Aluno[4];
		array[0] = a1;
		array[1] = a2;
		array[2] = a3;
		array[3] = a4;
		
	}
	
	public static void imprimirAlunos(List<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("nome: " + a.getNome());
		}
		//cada objeto Aluno vai se chamar "a" da lista alunos
		//usamos o a.getAtributoDesejado por se tratar de um objeto
	}

}
