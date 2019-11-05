package udc.edu.psw.mensagem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinhaRetaOval extends JFrame{
	private static final long serialVersionUID = 1L;
	
	Painel painel;
	
	public LinhaRetaOval() {
		super("Desenhando Formas");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);
		setLayout(new BorderLayout());
		
		painel = new Painel();
		add(painel, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	

}


class Painel extends JPanel{
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		
		/*g.setColor(Color.BLACK);
		g.drawLine(5, 40, 90, 95);
		
		g.drawRect(100, 40, 90, 55);
		g.fillRect(100, 40, 90, 55);
		
		g.setColor(Color.RED);
		g.fillRoundRect(195, 40, 90, 55, 50, 50);
		g.drawRoundRect(290, 40, 90, 55, 20, 20);
		
		g.setColor(Color.PINK);
		g.drawOval(195, 100, 90, 55);
		g.fillOval(290, 100, 90, 55);*/
		
		g.setColor(Color.DARK_GRAY); g.drawRect(15, 35, 80, 80);
		g.setColor(Color.CYAN); g.drawArc(15, 35, 80, 80, 0, 360);
		
		g.setColor(Color.DARK_GRAY); g.drawRect(100, 35, 80, 80);
		g.setColor(Color.CYAN); g.drawArc(100, 35, 80, 80, 0, 110);
		
		g.setColor(Color.DARK_GRAY); g.drawRect(185, 35, 80, 80);
		g.setColor(Color.CYAN); g.drawArc(185, 35, 80, 80, 0, -270);
		
		g.fillArc(15, 120, 80, 40, 0, 360);
		
		g.fillArc(100, 120, 80, 40, -270, 90);
		
		g.fillArc(185, 120, 80, 40, 0, -270);
		
		int xValues[] = {20,40,50,30,20,15};
		int yValues[] = {50,50,60,80,80,60};
		Polygon p = new Polygon(xValues, yValues, 6);
		g.drawPolygon(p);
		
		int xValues2[] = {70,90,100,80,70,65,60};
		int yValues2[] = {100,100,110,110,130,110,90};
		Polygon p2 = new Polygon(xValues2, yValues2, 7);
		g.drawPolygon(p2);
		
		
	}
}