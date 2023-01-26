package works.alga.estudos.regex;

public class ReplaceString {

	public static void main(String[] args) {
		// exemplo simples de substituicao
		String texto = "O valor do produto é R$ @x@.";

		String novoTexto = texto.replaceAll("@x@", "2,50");

		System.out.println(novoTexto);

	}

}
