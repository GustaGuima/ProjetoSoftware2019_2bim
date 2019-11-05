package udc.edu.GUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Path2D;
import java.util.ArrayList;

public class Draw extends Panel implements MouseListener, MouseMotionListener{
	private static final long serialVersionUID = 1L;
	
	private ArrayList retangulos = new ArrayList<>();
	private ArrayList circulos = new ArrayList<>();
	private ArrayList formas = new ArrayList<>();
	
	public Color color;
	
	public int grossuraPincel;
	private Path2D forma_2d;
	public boolean bool_forma = true, bool_retangulo = false, bool_circulo = false;
	
	private int uX, uY, x, y;
	
	
	public Draw() {
		this.color = Color.BLACK;
		this.setBackground(Color.white);
		this.forma_2d = new Path2D.Float();
		this.forma_2d.moveTo(0, 0);
		this.grossuraPincel = 5;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D draw = (Graphics2D)g;
		draw.setColor(Color.white);
		draw.fillRect(0, 0, this.getWidth(), this.getHeight());
		draw.setStroke(new BasicStroke(this.grossuraPincel));
		draw.setColor(this.color);
		draw.draw(this.forma_2d);
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
		if(this.bool_forma) {
			this.forma_2d.lineTo(this.x, this.y);
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(this.bool_forma) {
			this.forma_2d.moveTo(e.getX(), e.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}


}
