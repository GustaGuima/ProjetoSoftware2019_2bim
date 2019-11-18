package udc.edu.GUI;

import java.awt.Color;
import java.awt.Point;

import javax.swing.JPanel;

public class DuasDimensoes extends JPanel{
	private static final long serialVersionUID = 1L;
	
	protected boolean preenchido = false;
	protected int altura;
	protected int largura;
	protected Point inicio;
	protected Point fim;
	protected Color color;
	
	public DuasDimensoes() {
		super();
		setOpaque(false);
	}

	public DuasDimensoes(boolean preenchido, int altura, int largura, Point inicio, Point fim, Color color) {
		this();
		this.preenchido = preenchido;
		this.altura = altura;
		this.largura = largura;
		this.inicio = inicio;
		this.fim = fim;
		this.color = color;
	}

	public boolean isPreenchido() {
		return preenchido;
	}

	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	

	
	

}
