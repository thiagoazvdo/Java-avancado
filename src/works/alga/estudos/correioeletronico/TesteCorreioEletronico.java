package works.alga.estudos.correioeletronico;

public class TesteCorreioEletronico {
//VarArgs = Java 5+
	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

		String[] emails = new String[2];
		emails[0] = "thiagoazvdosoares@hotmail.com";
		emails[1] = "thiagoazenascimento@gmail.com";

		//1a forma de fazer
		//correio.enviarEmails(emails); 
		
		//2a forma de fazer
		//correio.enviarEmails(new String[] {"thiagoazvdosoares@hotmail.com" , "thiagoazenascimento@gmail.com"});
		
		//3a forma de fazer (com varargs - java 5 ou superior) observar classe CorreioEletronico
		correio.enviarEmails("thiagoazvdosoares@hotmail.com", "thiagoazenascimento@gmail.com");
		
		
		 
	}

}
