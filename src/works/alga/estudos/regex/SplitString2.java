package works.alga.estudos.regex;

public class SplitString2 {
	public static void main(String[] args) {
		String texto = "O4java1é3uma9linguagem9orientada1a8objetos";
		// inserindo cada palavra em uma posicao do array quebrando por valores númericos ao inves de espaço
		String[] palavras = texto.split("\\d+");  //o \\d indica valores numericos e o + indica um ou mais valores numericos
		
		for (String p : palavras) {
			System.out.println(p);
		}

	}
}
