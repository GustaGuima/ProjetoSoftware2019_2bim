package udc.edu.psw.mensagem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MouseFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel mousePanel;
	private JLabel mensagem;
	private JToolBar barra;
		
	public MouseFrame() {
		super("Tratamento dos eventos de mouse");
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		mousePanel = new JPanel();
		mousePanel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				mensagem.setText(String.format("O mouse foi solto no ponto (%d - %d).", e.getX(),e.getY()));
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				mensagem.setText(String.format("O mouse foi pressionado no ponto (%d - %d).", e.getX(),e.getY()));
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				mousePanel.setBackground(Color.BLUE);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				mousePanel.setBackground(Color.BLACK);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				String detalhe;
				if(e.isMetaDown())
					detalhe = "Com o borao direito";
				else if(e.isAltDown())
					detalhe = "Com botao do meio";
				else
					detalhe = "Com borao esquerdo";
				mensagem.setText(String.format("O mouse foi pressionado no ponto (%d - %d) %s.", e.getX(),e.getY(), detalhe));
				
			}
		});
		
		mousePanel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				mensagem.setText(String.format("O mouse foi clicado no ponto (%d - %d).", e.getX(),e.getY()));
				
			}
		});
		
		barra = new JToolBar();
		mensagem = new JLabel("Teste Mensagem");
		add(barra, BorderLayout.NORTH);
		add(mousePanel, BorderLayout.CENTER);
		add(mensagem, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}

}
