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

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class TelaPaint {

	private JFrame frmPaint;
	protected Point mousePos;
	private Draw paint = new Draw();
	protected JColorChooser chooseColor;
	protected Color choosedColor = Color.BLACK;

	
	
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
		
		Panel cabecalho = new Panel();
		cabecalho.setBounds(0, 0, 862, 61);
		frmPaint.getContentPane().add(cabecalho);
		cabecalho.setLayout(null);
		
		JButton livreButton = new JButton("Livre");
		livreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paint.setBool_forma(true);
				paint.setBool_circulo(false);
				paint.setBool_retangulo(false);
			}
		});
		livreButton.setBounds(744, 30, 108, 25);
		cabecalho.add(livreButton);
		
		JButton btnRetangulo = new JButton("Retangulo");
		btnRetangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paint.setBool_forma(false);
				paint.setBool_circulo(false);
				paint.setBool_retangulo(true);
			}
		});
		btnRetangulo.setBounds(629, 30, 108, 25);
		cabecalho.add(btnRetangulo);
		
		JButton btnCirculo = new JButton("Circulo");
		btnCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paint.setBool_forma(false);
				paint.setBool_circulo(true);
				paint.setBool_retangulo(false);
			}
		});
		btnCirculo.setBounds(513, 30, 108, 25);
		cabecalho.add(btnCirculo);
		
		Panel rodape = new Panel();
		rodape.setBounds(0, 460, 862, 61);
		frmPaint.getContentPane().add(rodape);
		rodape.setLayout(null);
		
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
				paint.setColor(choosedColor);
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
		
		
		paint.setBounds(0, 0, 862, 462);
		frmPaint.getContentPane().add(paint);
			
		
		paint.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				mousePos = paint.getMousePosition();
				positionX.setText(String.valueOf(mousePos.getX()));
				positionY.setText(String.valueOf(mousePos.getY()));
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				paint.mouseDragged(e);
				mousePos = paint.getMousePosition();
				positionX.setText(String.valueOf(mousePos.getX()));
				positionY.setText(String.valueOf(mousePos.getY()));
				
				
			}
		});
		paint.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				paint.mousePressed(e);
				
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
		
	}
}
