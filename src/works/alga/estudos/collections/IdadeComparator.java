package works.alga.estudos.collections;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		if (p1.getIdade() < p2.getIdade()) {
			return -1;
		} //o return -1 indica que a posicao que sera retornada primeiro sera o menor (direita do paraemtro)
		else if (p1.getIdade() > p2.getIdade()) {
			return 1;	
		} // o return 1 indica que sera o maior (da direita)
		
		return 0; //sao iguais entao a ordem nao importa
	}

}
