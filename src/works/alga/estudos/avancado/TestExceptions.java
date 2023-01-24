package works.alga.estudos.avancado;

public class TestExceptions {

	/*exceções :
	 *o java já tem diversas exceções mas podemos ainda
	 *criar exceções para tratar o programa para evitar
	 *que ele pare de funcionar (try catch) para personalizar a mensagem
	 *de erro, para tratar casos específicos etc. */
	
	public static void main(String[] args) {
		//System.out.println("antes");
		//int numero = 5 / 0;
		//System.out.println("depois");
		//System.out.println(numero);
		//lança java.lang.ArithmeticException depois da linha 7 em diante o programa sera interrompido, ou seja a linha 06 será executada

		
		//String s = null;
		//String maiuscula = s.toUpperCase();
		//lança java.lang.NullPointerException 
		
	
		ContaCorrente cc = new ContaCorrente(100);
//		cc.depositar(-10);
		
		/*tratamento de exceção - permite que o progrma continue sendo executado caso dê o erro esperado e podemos ainda usar o getMessage 
		 * para retirar a mensagem vermelha normalmente impressa no console */
		try {
			cc.depositar(-10);
		} catch (IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
		}
		
	}

}
