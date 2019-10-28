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
	
	JTextField login;
	JPasswordField senha;
	
	public JanelaEntrada() {
		super("UDC");
		setLayout(new FlowLayout());
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*add(new JLabel("Faz o que tu quiser"));
		add(new JTextField(10));
		
		add(new JTextField("Faz oq quiser dnv",20));*/
		
		login = new JTextField(30);
		login.setToolTipText("Login");
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "KOE "+ ((JTextField)e.getSource()).getText());
			}
		});
		add(login);
		
		senha = new JPasswordField(20);
		senha.setToolTipText("Senha");
		senha.addActionListener(new TextFieldHandler());
		add(senha);
		
		JButton botao = new JButton("Salvar");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Login: "+login.getText()+"\nSenha: "+ new String(senha.getPassword()));
				JOptionPane.showMessageDialog(null, "SALVO COM SUCESSO");
				
			}
		});
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

}
