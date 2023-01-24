package works.alga.estudos.string;

public class ExemplosClasseString8 {

	public static void main(String[] args) {
		String s = "java";

		// qual o indice que tem o primeiro caractere 'a'
		int indice = s.indexOf("a");
		
		System.out.println(indice);
		
		//se quisermos o ultimo caractere 'a'
		indice = s.lastIndexOf('a');
		System.out.println(indice);

	}

}
