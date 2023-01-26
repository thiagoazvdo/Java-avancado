package works.alga.estudos.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {
	
	private static final String REGEX = "\\\\w+@\\\\w+\\\\.w+"; 

	public static void main(String[] args) {
		// nesse caso o email valido do exemplo seria o primeiro
		String[] emails = {"joao@joao.com", "maria@", "jose@jose"};

		//System.out.println(emails[0]);
		
		// validando com a classe Pattern
		Pattern pattern = Pattern.compile(REGEX); // aqui passamos a expressao regular
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email); // aqui passamos o parametro (email) que iremos comparar com a expressao regular
			if (matcher.matches()) {					
				System.out.println(email + " é um email válido.");
				
				//Ver alternativa ao matcher.matches ou matcher.find pois nenhum dos dois esta  funcionando
			}											
		}
	}

}
