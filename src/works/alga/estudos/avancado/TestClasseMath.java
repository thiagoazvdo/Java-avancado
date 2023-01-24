package works.alga.estudos.avancado;

//import static java.lang.Math.PI;

public class TestClasseMath {
	
	
//	static final double PI = 3.1415;
	
	public static void main(String[] args) {
		//comprimento de uma circunferencia 2 x r x PI (3,1415)
		int raio = 4;
	//	double PI = 3.1415; //pode ser usado como constante uma vez que eh imutavel
	//	double comprimento = 2 * raio * PI;
	//	System.out.println("Comprimento: " + comprimento);
		
		//uma outra forma de fazer eh utilizando a classe math, veja o exemplo abaixo
		double comprimento = 2 * raio * Math.PI;
		//double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento);
		//dessa forma nem precisaríamos da constante criada na linha 06 pois a classe match nos fornece
		//poderíamos ainda renomear (observar linha 03) para não precisar utilizar sempre o Math.PI, assim podemos chamar aoenas PI (observe a linha 19).
		
		
		//maximo e minimo
		double[] precoProdutoA = {30.20, 25.49};
		double maiorPreco = Math.max(precoProdutoA[0], precoProdutoA[1]);
		System.out.println("maior preço: " + maiorPreco);
		double menorPreco = Math.min(precoProdutoA[0], precoProdutoA[1]);
		System.out.println("menor preço: " + menorPreco);

		
		//potencia
		System.out.println("2^3 (elevado) = " + Math.pow(2, 3));
		
		
		//raiz quadrada
		System.out.println("raiz quadrada de 9 = " + Math.sqrt(9));
		
		
		//arredondamento ceil, floor e round
		double n = 5.68;
		double o = 5.49;
		System.out.println("maior inteiro = " + Math.floor(n));
		System.out.println("menor inteiro = " + Math.ceil(n));
		System.out.println("arredondando (seguindo regra matematica)= " + Math.round(n));
		System.out.println("arredondando (seguindo regra matematica)= " + Math.round(o));

		
		//trigronometria
		System.out.println("seno = " + Math.sin(40));
		
		
		//números aletaórios entre 0 e 1
		double numeroAleatorio = Math.random();
		//double numeroAleatorio = Math.random() * 100;
		System.out.println(numeroAleatorio);
		//caso queira mudar a proporção do valor podemos multiplicar para obter dentro do intervalo desejado 
		//e caso queira um numero inteiro podemos usar as funções math.floor() e math.ceil() linha 44 e 45, como exemplo abaixo
		//System.out.println(Math.floor(numeroAleatorio));

	
	}

}
