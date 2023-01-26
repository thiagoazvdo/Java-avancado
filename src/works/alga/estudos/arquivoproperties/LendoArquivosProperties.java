package works.alga.estudos.arquivoproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

//AULA DE PROPERTIES - ANALISAR TAMBEM O ARQUIVO config.properties na pasta config deste proejto

public class LendoArquivosProperties {

	public static void main(String[] args) throws FileNotFoundException, Exception {
		// conectar no banco de dados
		String url = "jdbc:mysql://localhost/cadastro_cliente";
		String usuario = "root";
		String senha = "root";

		// no arquivo properties substitui a declaracao nas classes que realizam a
		// conexao com o banco de dados
		// dessa forma so precisamos chamar a classe properties e referenciar o arquivo
		// criado conforme exemplo abaixo
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config/config.properties"));

		prop.getProperty("banco.dados.url"); // chave descrita no arquivo properties e ele vai buscar a senha
		prop.getProperty("banco.dados.usuario");
		prop.getProperty("banco.dados.senha");

		System.out.printf("simulando a conexao no banco de dados de url : %s e usuário : %s\n", url, usuario);
		
		try {
			int x = 5 / 0;
		} catch (Exception e) {
			//se acontecer algum erro, você precisará informar ao adminsitrador por e-mail
			String email = prop.getProperty("email.admin");
			System.err.printf("enviando email para : %s informando erro : %s", email, e.getMessage());
			//system.err eh geralmente usado para imprimir possiveis erros e a mensagem fica em cor vermelha no console
		}

	}
}
