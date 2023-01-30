package works.alga.estudos.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteDatas {
	public static void main(String[] args) {

		// atenção para o import do pacote java.util.date
		Date hoje = new Date();
//		System.out.println(hoje);
		
		/*para formatar a data do maneira desejada podendo ser dd/MM/yyyy ou DD-MM-YYY ou MM-DD-YYYY etc.
		  lembrando que o java diferencia pelo caixa alta ou baixa da letra no caso do mês M e minuto m*/
		DateFormat formatador = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
//		System.out.println(formatador.format(hoje));
		
		/*para converter essa data de aniversario em date*/
		String dataAniversario = "23/10/1994";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador.format(aniversario));
		} catch (ParseException e) {
			System.out.printf("formato de data inválido");
		}
		
		
		//lembrando que hora também eh com objeto do tipo date precisando apenas usar a mascara HH:mm:ss

	}

}
