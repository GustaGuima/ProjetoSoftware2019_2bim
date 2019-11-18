package udc.edu.exercicio16_3;

public class Pilha {
	
	private Object[] vetor;
	private int ponteiro;
	
	public Pilha(int tamanho) {
		ponteiro = -1;
		vetor = new Object[tamanho];
	}
	
	public boolean isEmpty() {
		if(ponteiro == -1) {
			return true;
		}
		return false;
	}
	
	public int tamanho() {
		if(this.isEmpty()) {
			return 0;
		}
		return ponteiro + 1;
	}
	
	public Object ultimoValor() {
		if(this.isEmpty()) {
			return null;
		}
		return vetor[ponteiro];
	}
	
	public Object desempilhar() {
		if(this.isEmpty()) {
			return null;
		}
		return vetor[ponteiro--];
	}
	
	public void empilhar(Object valor) {
		if(ponteiro < vetor.length - 1) {
			vetor[++ponteiro] = valor;
		}
	}
	

}
