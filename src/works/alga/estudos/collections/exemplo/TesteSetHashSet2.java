package works.alga.estudos.collections.exemplo;

import java.util.Set;

public class TesteSetHashSet2 {
	//explicacao de equals e hashCode
	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		//sorteio de aluno e constrói o objeto aluno
		Aluno alunoSorteado = new Aluno("Maria");
		
		if (alunos.contains(alunoSorteado)) {
			System.out.println("parabéns " + alunoSorteado.getNome() + " você GANHOOOU!!");
		}
		else {
			System.out.println("aluno nao cadastrado no banco de dados.");
		}
		
		/*por mais que pareça que cairá dentro do if, ele nao esta
		 *sendo usado para identificar o atributo do objeto Aluno
		 *para funcionar essa comparacao, vá até a classe Aluno dentro
		 *desse pacote e gere o metodo equals do atributo nome*/
	}

}
