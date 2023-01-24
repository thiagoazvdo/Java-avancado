package works.alga.estudos.string;

public class ExemplosClasseString {
	
	public static void main(String[] args) {
		//string eh uma cadeia de caracteres
		
		
		String nome = "pedro";
		System.out.println(nome.toUpperCase());
		System.out.println(nome); //note que o touppercase na linha 9 nao alterou a string
		
		nome = nome.toUpperCase(); //agora sim, estamos atribuindo o uppercase para a string
		System.out.println(nome); 
		
		String s1 = "pedro";
		String s2 = "pedro";
		System.out.println("s1 == s2? " + (s1 == s2));
		
		String s3 = new String("pedro"); 
		System.out.println("s3 == s1? " + (s3 == s1));//falso porque s3 esta criando um novo objeto
		//a maneira correta para comparar strings eh usando o equals
		
		System.out.println(s3.equals(s1));
		System.out.println(s1.equals(s2));
		//agora sim estamos comparando o conteudo das strings e nao a referencia
		
		String s4 = "PeDrO";
		System.out.println(s1.equals(s4)); //as strings estao diferentes por conta de algumas letras maiusculas
		System.out.println(s1.equalsIgnoreCase(s4)); //transforma todas as letras maiusculas ou minusculas para comparar
	}

}
