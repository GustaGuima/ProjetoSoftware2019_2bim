package udc.edu.exercicio16_3;

public class Principal {
	
	public static void main(String[] args) {
		
		Pilha p = new Pilha(10);
		
		p.empilhar(5);
		p.empilhar(10);
		p.empilhar(20);
		
		System.out.println(p.ultimoValor());
		
	}

}
