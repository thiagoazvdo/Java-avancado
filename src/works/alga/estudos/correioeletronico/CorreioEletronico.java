package works.alga.estudos.correioeletronico;

public class CorreioEletronico {
//VarArgs - Java 5+
	
	
	// forma padrao -- passando por parametro um array de string
//	public void enviarEmails(String [] emails) {   

	// forma utilizando varargs -- dessa forma nao precisamos definir a quantidade
	// de strings que serao passadas por parametro
	public void enviarEmails(String... emails) {

		for (String email : emails) {
			System.out.println("e-mail enviado para : " + email);
		}
	}

}
