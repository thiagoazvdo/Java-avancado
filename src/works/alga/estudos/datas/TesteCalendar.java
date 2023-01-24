package works.alga.estudos.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {
		// classe de calendario
		Calendar c = new GregorianCalendar();

		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 0); // o mes começa no zero, entao esse mes sera referente a janeiro
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 00);

		// dessa forma estamos setando um horario

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(c.getTime()));
		/*
		 * o tipo esperado pelo format precisa de um objeto do tipo calendar entao
		 * podemos usar a função getTime()
		 */

		// somando ou subtraindo valores com datas de maneira muito simples sem se
		// preocupar com os dias do ano
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));

		// diminuindo 1 mes da data declarada, tambem aplicavel a dia, hora, minuto e seg
		c.add(Calendar.MONTH, -2);
		System.out.println(formatador.format(c.getTime()));
		
		/*aumentar uma quantidade no mes, no dia ou no ano sem considerar o calendario
		  no exemplo abaixo usamos a mesma data anterior e acrescentamo 1 no dia
		  31/01/2022 rolando o 1 dia a mais voltaria para o 1/01/2022 */
		c.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));


	}

}
