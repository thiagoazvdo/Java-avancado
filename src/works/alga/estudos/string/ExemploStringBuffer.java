package works.alga.estudos.string;

public class ExemploStringBuffer {

	public static void main(String[] args) {

//		StringBuffer sb = new StringBuffer(); 	//thread-safe - use no contexto de concorrencia 
		StringBuilder sb = new StringBuilder(); // nao thread-safe - mais rapido

		/*
		 * a classe stringbuilder diferente da string eh mutavel, o que traz uma
		 * vantagem pois pode ser concatenada sem a necessidade de criar uma nova string
		 */

		sb.append("bem vindo ao curso de java ");
		sb.append("fique a vontade para tirar suas duvidas ");
		sb.append("estamos aqui para te ajudar. ");

		System.out.println(sb.toString());
		/*
		 * nesse caso nao precisaria do tostring mas se tivessemos usando de outra forma
		 * em algum metodo que estivesse esperando uma string precisariamos usar esse
		 * tostring
		 */

		sb.insert(26, " da algaworks");
		// nesse caso inserimos na posicao 26 a string passada no 2 parametro

		System.out.println(sb);

	}
}
