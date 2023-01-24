package works.alga.estudos.string;

public class ExemplosClasseString7 {

	public static void main(String[] args) {
		String s = "Cursos_online_de_desenvolvimento_de_software";

		/*
		 * pedindo para quebrar onde tiver _ e cada palavra vai ser uma posicao do array
		 */
		String[] array = s.split("_");
		for (int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "]=" + array[i]);
		}

	}

}
