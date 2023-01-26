package works.alga.estudos.regex;

public class SplitString {
	public static void main(String[] args) {
		String texto = "O java é uma linguagem orientada a objetos";
		// inserindo cada palavra em uma posicao do array
		String[] palavras = texto.split(" ");
		//o espaco em branco da linha anterior eh feito por regex
		for (String p : palavras) {
			System.out.println(p);
		}

	}

}
