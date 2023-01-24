package works.alga.estudos.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	/*dessa forma temos o ponto como separador de casas decimais que
	 *nao eh usado aqui no brasil. outras formas de usar o formatador
	 *seria quantas casas decimais queremos mostrar a esquerda etc*/

	
	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		//# sao opcionais, ou seja, pelo menos 1 casa antes e 2 antes da virgula
		double valorProduto = 13.5;
		// R$ 1.300,59
		
		System.out.println("sem formatação " + valorProduto);
		System.out.println("com formatação " + formatador.format(valorProduto));

		
		//pegando uma string e convertendo para um numero double
		String entrada = "R$ 50,34";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("numero: " + numero);
		} catch (ParseException e) {
			System.out.println("entrada inválida.");
		}
		
		BigDecimal bg = new BigDecimal(50004949999555881d);
		/*possui um limite maior que o double, colocamos o d no final 
		 *para informar que eh double. podemos usar metodos da classe
		 *bigdecimal. exemplo: divisoes, maximo, mininmo, multiplicacoes
		 *etc*/
		bg = bg.divide(BigDecimal.TEN);
		System.out.println(bg);
		
		
	}

}
