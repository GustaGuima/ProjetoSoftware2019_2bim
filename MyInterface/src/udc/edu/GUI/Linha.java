package udc.edu.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Linha extends DuasDimensoes{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		g.setColor(color);
		g.drawLine(inicio.x, inicio.y, fim.x, fim.y);
	
	}

	public Linha() {
		super();
	}

	public Linha(boolean preenchido, int altura, int largura, Point inicio, Point fim, Color color) {
		super(preenchido, altura, largura, inicio, fim, color);
	}

	
	

}
