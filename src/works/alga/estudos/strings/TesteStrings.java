package works.alga.estudos.strings;

public class TesteStrings {

	public static void main(String[] args) {
		// string, stringbuilder e stringbuffer
		
		String s = "olá"; // criada a string "olá" <- garbage collector pode excluir
		s = s + " pessoal!"; // criada a string "olá pessoal"
		System.out.println(s);
	
		// pratica correta pois o stringbuilder concatena e reaproveita a string builder
		StringBuilder sb = new StringBuilder("olá");
		sb.append(" pessoal!");
		// stringbuilder nao eh protegida com relação a threads, o indicado eh stringbuffer
		String resultado = sb.toString();
		System.out.println("com StringBuilder: " + resultado);
		
		
		
	}
}
