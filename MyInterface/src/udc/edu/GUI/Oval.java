package udc.edu.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Arrays;

public class Oval extends DuasDimensoes {
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {

		super.paintComponents(g);
		g.setColor(color);

		if (preenchido) {
			g.fillOval(0, 0, largura - 1, altura - 1);
		} else {
			g.drawOval(0, 0, largura - 1, altura - 1);
		}
	}

	public Oval() {
		super();
	}

	public Oval(boolean preenchido, int altura, int largura, Point inicio, Point fim, Color color) {
		super(preenchido, altura, largura, inicio, fim, color);
	}

	@Override
	public String toString() {
		return "Circulo: X: "+ this.getX() + ", Y: "+ this.getY();
	}
	
}
