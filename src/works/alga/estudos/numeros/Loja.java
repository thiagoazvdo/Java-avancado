package works.alga.estudos.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Loja {
	
	/*Desenvolva um programa que:
	Recebe como parâmetro do usuário o valor de um produto do tipo double.
	Instancia um objeto do tipo BigDecimal atribuindo o valor double a ele.
	Calcula 10% do valor usando os métodos disponíveis na classe BigDecimal.
	Formata o novo valor calculado para o padrão monetário (R$).
	Exibe na tela o valor calculado e formatado.
	  */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*=*=*=*=*= calculadora de percentual de produtos =*=*=*=*=*");
		System.out.println("informe o valor desejado para cálculo (exemplo 45 ou 45,69): ");
		double valor = sc.nextDouble();
		
		BigDecimal bg = new BigDecimal(valor);
		bg = bg.divide(BigDecimal.TEN);
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		System.out.println("10% do valor calculado é : " + formatador.format(bg));
		
		
	}
}
