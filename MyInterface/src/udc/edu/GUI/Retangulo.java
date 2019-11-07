package udc.edu.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Retangulo extends DuasDimensoes{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		g.setColor(color);
		
		if(preenchido) {
			g.fillRect(0, 0, largura - 1, altura - 1);
		}else {
			g.drawRect(0, 0, largura - 1, altura - 1);
		}
	}

	public Retangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retangulo(boolean preenchido, int altura, int largura, Point inicio, Point fim, Color color) {
		super(preenchido, altura, largura, inicio, fim, color);
		// TODO Auto-generated constructor stub
	}
	
	

}
