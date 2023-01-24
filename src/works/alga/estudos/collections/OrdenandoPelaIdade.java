package works.alga.estudos.collections;

import java.util.Arrays;
import java.util.List;

public class OrdenandoPelaIdade {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("joão", 22);
		Pessoa p2 = new Pessoa("adriana", 23);
		Pessoa p3 = new Pessoa("bruno", 21);

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		IdadeComparator idadeComparator = new IdadeComparator();
//		Collections.sort(pessoas, idadeComparator);
		
		
		pessoas.sort(idadeComparator);
		
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		
		/*for each Java 8 ou superior
		 *para cada um elemento de pessoas
		 *quero que chame o metodo println 
		 *recebendo como parametro a pessoa */
	//	pessoas.forEach(System.out::println);
		
		
	}

}
