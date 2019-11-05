package udc.edu.GUI;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.List;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class TelaLogin {

	private JFrame frmPaint;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public TelaLogin() {
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
		
		Draw paint = new Draw();
		paint.setBounds(0, 62, 862, 398);
		frmPaint.getContentPane().add(paint);
		
		Panel cabecalho = new Panel();
		cabecalho.setBounds(0, 0, 862, 61);
		frmPaint.getContentPane().add(cabecalho);
		
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
		
		
		
		
		paint.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				paint.mouseDragged(e);
				
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
