package udc.edu.psw.mensagem;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public Janela() {
		super("INTELIGENCIA ARTIFICIAL");
		setLayout(new BorderLayout());
		
		JLabel label = new JLabel("Denovo voce parceiro");
		this.add(label, BorderLayout.CENTER);
		JLabel label2 = new JLabel("Puta merda");
		this.add(label2, BorderLayout.SOUTH);
	}

}
