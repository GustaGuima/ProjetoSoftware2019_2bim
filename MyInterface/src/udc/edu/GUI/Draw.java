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

public class Draw extends Panel implements MouseListener, MouseMotionListener{
	private static final long serialVersionUID = 1L;
	
	public Color color;
	
	public int grossuraPincel;
	private Path2D forma_2d;
	private Point inicio;
	private Point fim;
	private int altura;
	private int largura;
	public boolean bool_forma = false, bool_retangulo = false, bool_circulo = false;
	
	private int uX, uY, x, y;
	
	 
	
	public Point getInicio() {
		return inicio;
	}

	public void setInicio(Point inicio) {
		this.inicio = inicio;
	}

	public Point getFim() {
		return fim;
	}

	public void setFim(Point fim) {
		this.fim = fim;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getGrossuraPincel() {
		return grossuraPincel;
	}

	public void setGrossuraPincel(int grossuraPincel) {
		this.grossuraPincel = grossuraPincel;
	}

	public Path2D getForma_2d() {
		return forma_2d;
	}

	public void setForma_2d(Path2D forma_2d) {
		this.forma_2d = forma_2d;
	}

	public boolean isBool_forma() {
		return bool_forma;
	}

	public void setBool_forma(boolean bool_forma) {
		this.bool_forma = bool_forma;
	}

	public boolean isBool_retangulo() {
		return bool_retangulo;
	}

	public void setBool_retangulo(boolean bool_retangulo) {
		this.bool_retangulo = bool_retangulo;
	}

	public boolean isBool_circulo() {
		return bool_circulo;
	}

	public void setBool_circulo(boolean bool_circulo) {
		this.bool_circulo = bool_circulo;
	}

	public int getuX() {
		return uX;
	}

	public void setuX(int uX) {
		this.uX = uX;
	}

	public int getuY() {
		return uY;
	}

	public void setuY(int uY) {
		this.uY = uY;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public Draw(Color color, int grossuraPincel, Path2D forma_2d, Point inicio, Point fim, int altura, int largura,
		boolean bool_forma, boolean bool_retangulo, boolean bool_circulo, int uX, int uY, int x, int y) {
		super();
		this.color = color;
		this.grossuraPincel = grossuraPincel;
		this.forma_2d = forma_2d;
		this.inicio = inicio;
		this.fim = fim;
		this.altura = altura;
		this.largura = largura;
		this.bool_forma = bool_forma;
		this.bool_retangulo = bool_retangulo;
		this.bool_circulo = bool_circulo;
		this.uX = uX;
		this.uY = uY;
		this.x = x;
		this.y = y;
	}

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
		if(this.bool_retangulo) {
			
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
