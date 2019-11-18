package udc.edu.GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Path2D;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseMotionAdapter;

public class TelaPaint {

	private JFrame frmPaint;
	protected Point mousePos;
	private JPanel paint = new JPanel();	
	protected JColorChooser chooseColor;
	protected Color choosedColor = Color.BLACK;
	
	protected Path2D shape = new Path2D.Float();
	
	protected Point mouseReleased;
	protected Point mousePressed;
	protected int forma = 1;
	protected boolean preenchido = false;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPaint window = new TelaPaint();
					window.frmPaint.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPaint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaint = new JFrame();
		frmPaint.setTitle("Paint 2.0");
		frmPaint.setBounds(100, 100, 880, 568);
		frmPaint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaint.getContentPane().setLayout(null);
		
		paint.setBackground(Color.WHITE);
		paint.setBounds(0, 62, 862, 400);
		frmPaint.getContentPane().add(paint);
		
		paint.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			mouseReleased = paint.getMousePosition();
			DuasDimensoes c = null;
			switch(forma) {
			case 1:
				c = new Linha();
				break;
			case 2:
				c = new Retangulo();
				break;
			case 3:
				c = new Oval();
				break;
				
			}
			c.setInicio(mousePressed);
			c.setFim(mouseReleased);
			c.setLargura(mouseReleased.x - mousePressed.x);
			c.setAltura(mouseReleased.y - mousePressed.y);
			c.setPreenchido(preenchido);
			c.setColor(choosedColor);
			c.setLocation(mousePressed);
			c.setSize(c.getLargura(), c.getAltura());
			
			paint.add(c);
			
			paint.repaint();
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			mousePressed = paint.getMousePosition();
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		});
		
		Panel cabecalho = new Panel();
		cabecalho.setBounds(0, 0, 862, 61);
		frmPaint.getContentPane().add(cabecalho);
		cabecalho.setLayout(null);
		
		Panel rodape = new Panel();
		rodape.setBounds(0, 460, 862, 61);
		frmPaint.getContentPane().add(rodape);
		rodape.setLayout(null);
		
		JLabel figuraSelecionada = new JLabel("");
		figuraSelecionada.setBorder(new TitledBorder(null, "Figura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		figuraSelecionada.setBounds(649, 13, 86, 35);
		rodape.add(figuraSelecionada);
		
		JButton livreButton = new JButton("Linha");
		livreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				forma = 1;
				figuraSelecionada.setText("Linha");
			}
		});
		livreButton.setBounds(744, 30, 108, 25);
		cabecalho.add(livreButton);
		
		JButton btnRetangulo = new JButton("Retangulo");
		btnRetangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				forma = 2;
				figuraSelecionada.setText("Retangulo");
			}
		});
		btnRetangulo.setBounds(629, 30, 108, 25);
		cabecalho.add(btnRetangulo);
		
		JButton btnCirculo = new JButton("Circulo");
		btnCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				forma = 3;
				figuraSelecionada.setText("Circulo");
			}
		});
		btnCirculo.setBounds(513, 30, 108, 25);
		cabecalho.add(btnCirculo);
		
		JButton btnPreenchido = new JButton("Preenchido");
		btnPreenchido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(preenchido) {
					preenchido = false;
				}else {
					preenchido = true;
				}
			}
		});
		btnPreenchido.setBounds(248, 31, 108, 23);
		cabecalho.add(btnPreenchido);
		

		
		JLabel positionY = new JLabel("");
		positionY.setBorder(new TitledBorder(null, "Y", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		positionY.setBounds(100, 13, 53, 35);
		rodape.add(positionY);
		
		JLabel positionX = new JLabel("");
		positionX.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "X", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		positionX.setBounds(35, 13, 53, 35);
		rodape.add(positionX);
		
		JLabel corEscolhida = new JLabel("");
		corEscolhida.setBounds(318, 13, 40, 35);
		corEscolhida.setBackground(choosedColor);
		corEscolhida.setOpaque(true);
		rodape.add(corEscolhida);
		
		JButton corButton = new JButton("COR");
		corButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseColor = new JColorChooser();
				choosedColor = chooseColor.showDialog(null, "Choose your Color", Color.BLACK);
				corEscolhida.setBackground(choosedColor);
				corEscolhida.setOpaque(true);
			
			}
		});
		corButton.setBackground(Color.WHITE);
		corButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		corButton.setBounds(209, 13, 97, 35);
		rodape.add(corButton);
		
		JLabel label = new JLabel("");
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(new TitledBorder(null, "Qtd", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		label.setBounds(774, 13, 56, 35);
		rodape.add(label);
		
	}
}
