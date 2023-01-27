package works.alga.estudos.generics;

import java.util.ArrayList;
import java.util.List;

public class TestaRetiraElementos {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("João");
		nomes.add("Maria");
		
		
		String nome = (String) RetiraElementos.recuperaPrimeiro(nomes);
		//fazendo um casting de object para string
		System.out.println(nome);
		
		
		//Exemplo 2 com o metodo recuperaPrimeiro do tipo generics que recebe uma lista do tipo generics
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(new Funcionario("Ricardo"));
		
		Funcionario f = RetiraElementos.recuperaPrimeiro(funcionarios);
		//dessa forma seguindo o mesmo exemplo anterior nao precisamos fazer o casting
		System.out.println(f.getNome());
				
		
	}

}
