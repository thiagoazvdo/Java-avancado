package works.alga.estudos.joptionpane;

import javax.swing.JOptionPane;

public class ExemploJOptionPane3 {

	public static void main(String[] args) {

		Object[] opcoes = { "Sim", "Não", "Sim, com e-mail" };

		int opcao = JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro?", "Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);
		// aparecera 3 opceos e a opcao 2 já vai aparecer pre-selecionada
		System.out.println("Opção selecionada : " + opcao);
		/*
		 * o botao clicado pelo usuario corresponde a uma posicao do array de opcoes que
		 * sera retornado
		 */
		
		if (opcao == 1) {
			// ..... implementar 
		}
		
	}
}
