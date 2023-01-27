package works.alga.estudos.generics;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> { // a convenção pede para colocar uma letra maiuscula, pode ser qualquer letra

	private List<E> colecao = new ArrayList<>(); // criando uma lista de generics


	public void colocar(E e) {
		colecao.add(e); // adicionando o generics no metodo que recebe por parametro um generics
	}

	public E retirarPrimeiro() {
		return colecao.get(0);
	}

}
