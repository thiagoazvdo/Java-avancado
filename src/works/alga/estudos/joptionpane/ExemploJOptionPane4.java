package works.alga.estudos.joptionpane;

import javax.swing.JOptionPane;

public class ExemploJOptionPane4 {
	
	public static void main(String[] args) {
		
		Object[] possibilidades = {"masculino", "feminino", "não-binario", "outro"};
		//indicando as possibilidades da pergunta seguinte
		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione sexo", "Formulário", JOptionPane.PLAIN_MESSAGE, null, possibilidades, possibilidades[0]);
		//o JOptionPane por default retorna um int entao fizemos o casting para string e pedimos para o usuario clicar na opção adequada que sera atribuida ao atributo sexo

		System.out.println("Sexo selecionado: " + sexo);
		
		String nome = (String) JOptionPane.showInputDialog(null, "Digite seu nome: ", "Formulário", JOptionPane.PLAIN_MESSAGE, null, null, null);
		//o JOptionPane por default retorna um int entao fizemos o casting para string e pedimos para o usuario digitar o nome 
		System.out.println(nome);
		
	}

}
