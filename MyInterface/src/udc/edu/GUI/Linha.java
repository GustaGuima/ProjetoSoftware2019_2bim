package udc.edu.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Linha extends DuasDimensoes{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		g.setColor(color);
		g.drawLine(0, 0, 1, 1);
	
	}

	public Linha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Linha(boolean preenchido, int altura, int largura, Point inicio, Point fim, Color color) {
		super(preenchido, altura, largura, inicio, fim, color);
		// TODO Auto-generated constructor stub
	}

	
	

}
