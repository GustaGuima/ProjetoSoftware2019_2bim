package udc.edu.exercicio16_4;

public class Principal {
	
	public static void main(String[] args) {
		Fila f = new Fila(10);
		
		f.add(10);
		f.add(5);
		f.add(50);
		
		System.out.println(f.head());
	}

}
