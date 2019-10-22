package udc.edu.psw.mensagem;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JanelaEntrada extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public JanelaEntrada() {
		super("UDC");
		setLayout(new FlowLayout());
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new JLabel("Faz o que tu quiser"));
		add(new JTextField(10));
		
		add(new JTextField("Faz oq quiser dnv",20));
		
		JTextField textField = new JTextField("ESCREVE NADA AQUI NAO");
		textField.setEditable(false);
		add(textField);
		
		add(new JLabel("Digita tua senha ae"));
		add(new JPasswordField(20));
		
		JPasswordField senha = new JPasswordField(20);
		senha.setToolTipText("Uma dica para o campo");
		senha.addActionListener(new TextFieldHandler());
		add(senha);
		
		JButton botao = new JButton("Salvar");
		botao.addActionListener(new ButtonHandler());
		add(botao);
		
		
		setVisible(true);
	}
	
	class TextFieldHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			String str = new String(((JPasswordField)event.getSource()).getPassword());
			if(str.length() < 10) {
				JOptionPane.showMessageDialog(null, "Senha muito fraca, seu merda");
			}else {
				JOptionPane.showMessageDialog(null, str+"? que senha merda");
			}
		}
	}
	
	class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
		}		
	}

}
