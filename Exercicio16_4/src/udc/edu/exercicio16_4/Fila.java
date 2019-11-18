package udc.edu.exercicio16_4;

public class Fila {
	
	private Object[] fila;
	private int capacidade, head, tail;
	
	public Fila(int capacidade) {
		this.capacidade = capacidade;
		head = -1;
		tail = -1;
		fila = new Object[capacidade];
	}
	
	public boolean isEmpty() {
		return (head == -1 && tail == -1);
	}
	
	public boolean isFull() {
		return ((tail + 1) % capacidade) == head;
	}
	
	public void add(Object valor) {
		
		if(this.isFull()) {
			throw new RuntimeException("Is Full");
		}
		if(this.isEmpty()) {
			head = 0;
			tail = 0;
			fila[0] = valor;
		}else {
			tail = (tail + 1) % capacidade;
			fila[tail] = valor;
		}
		
	}
	
	public Object remove() {
		
		if(isEmpty()) {
			throw new RuntimeException("Queue Is Empty");
		}
		
		Object valor = fila[head];
		
		if(head == tail) {
			head = -1;
			tail = -1;
		}else {
			head = (head + 1) % capacidade;
		}
		return valor;
	}
	
	public Object head() {
		if(this.isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		return fila[head];
	}

}
