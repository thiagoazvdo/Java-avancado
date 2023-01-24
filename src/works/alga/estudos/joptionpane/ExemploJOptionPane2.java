package works.alga.estudos.joptionpane;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOptionPane2 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
		
		
		JOptionPane.showMessageDialog(null, "Atenção - e-mail não informado.", "Atenção", JOptionPane.WARNING_MESSAGE);
	
		
		JOptionPane.showMessageDialog(null, "Favor informar o CPF.", "Erro", JOptionPane.ERROR_MESSAGE);

		
		JOptionPane.showMessageDialog(null, "Obrigado.", "Obrigado", JOptionPane.PLAIN_MESSAGE);
		
		//inserindo um icone especifico
		URL url = ExemploJOptionPane2.class.getResource("teste_caricatura.png");
		Icon icone = new ImageIcon(url);
		
		JOptionPane.showMessageDialog(null, "Parabéns por seu esforço Thiago.", "Amor próprio ou auto reconhecimento? rs", JOptionPane.INFORMATION_MESSAGE, icone);


	}

}
