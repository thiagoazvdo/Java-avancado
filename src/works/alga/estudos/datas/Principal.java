package works.alga.estudos.datas;

import java.util.Scanner;

public class Principal {

	/*
	 * Desenvolva um programa que:
	 * 
	 * Recebe como parâmetro do usuário o valor de um produto do tipo double.
	 * Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
	 * Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
	 * Formata o novo valor calculado para o padrão monetário (R$). Exibe na tela o
	 * valor calculado e formatado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("informe a data do último periodo menstrual seguindo esse formato (DD-MM-AAAA): ");
		String dataInformada = sc.nextLine();

		CalculadoraGravidez cg = new CalculadoraGravidez(dataInformada);

		System.out.println(cg.calcularDataEstimadaParto());
		System.out.println(cg.calcularDataEstimadaConcepcao());

	}

}
