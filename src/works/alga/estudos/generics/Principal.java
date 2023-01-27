package works.alga.estudos.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List funcionarios = new ArrayList();

		funcionarios.add(new Funcionario("João"));
		funcionarios.add(new Funcionario("Maria"));

		funcionarios.add("Ricardo");
		// o conceito seria adicionar objetos mas na linha anterior estamos adicionando
		// uma string
		// pois a estrutura do arraylist funcionarios nos permite essa insercao

	/*	for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario f = (Funcionario) funcionarios.get(i);
			System.out.println("nome do funcionario : " + f.getNome());
		}
	*/
		// fazendo o mesmo procedimento mas agora com o generics percebemos que o
		// compilador nao permite tal insercao

		List<Funcionario> funcionariosEmpresa = new ArrayList<Funcionario>();

		funcionariosEmpresa.add(new Funcionario("Pedro"));
		funcionariosEmpresa.add(new Funcionario("Lúcia"));

		// funcionariosEmpresa.add("Ricardo"); DESCOMENTAR LINHA PARA MELHOR
		// ENTENDIMENTO

		// no exemplo anterior o erro foi em tempo de execucao, já nesse exemplo o erro
		// foi em tempo de compilacao
		for (Funcionario f : funcionariosEmpresa) {
			System.out.println("nome do funcionario : " + f.getNome());
		}

	}

}
