package works.alga.estudos.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
	/*
	 * Desenvolva um programa que: Recebe como parâmetro do usuário o valor de um
	 * produto do tipo double. Instancia um objeto do tipo BigDecimal atribuindo o
	 * valor double a ele. Calcula 10% do valor usando os métodos disponíveis na
	 * classe BigDecimal. Formata o novo valor calculado para o padrão monetário
	 * (R$). Exibe na tela o valor calculado e formatado.
	 */

	private Date dataUltimoPeriodoMenstrual;

	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}

	public CalculadoraGravidez(String dataInformada) {

	}

	private Date converterStringParaDate(String dataInformada) {
		DateFormat formatador = new SimpleDateFormat("dd-MM-yyy");
		try {
			formatador.parse(dataInformada);
		} catch (ParseException e) {
			System.out.println("formato de data inválido");
		}
		return null;
	}

	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}

	public String calcularDataEstimadaConcepcao() {
		DateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, 14);
		return "a data estimada da concepção (ato sexual) " + formatador.format(c.getTime());
	}

	public String calcularDataEstimadaParto() {
		DateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = new GregorianCalendar();

		c.add(Calendar.WEEK_OF_YEAR, 40);
		return "a data estimada do parto " + formatador.format(c.getTime());
	}

}
