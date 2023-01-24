package works.alga.estudos.joptionpane;

import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class ExemploJOptionPane1 {

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
//		UIManager.setLookAndFeel(UIManager.getLookAndFeel()); //caso esteja rodando no MacOS e deseje usar uma interface diferente
		JOptionPane.showMessageDialog(null, "seu cadastro foi realizado com sucesso!");

	}

}
