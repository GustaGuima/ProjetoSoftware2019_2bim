package udc.edu.psw.mensagem;

import javax.swing.JOptionPane;

public class Mensagem {
	
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "OLA MUNDO");
		String nome;
		nome = JOptionPane.showInputDialog(null, "Qual seu nome parceiro?");
		String resposta;
		resposta = JOptionPane.showInputDialog(null, "Koe "+ nome + ",Tudo em cima, vou te fazer mais uma pergunta, pode ser?");
		while(!resposta.equals("Sim") && !resposta.equals("Nao")){
			JOptionPane.showMessageDialog(null, "Nao entendi cara");
			resposta = JOptionPane.showInputDialog(null, "Koe "+ nome + ", posso ou nao??");
		}
		if(resposta.equals("Sim")) {
			String idade = JOptionPane.showInputDialog("Qual sua idade cara?");
			int i = Integer.parseInt(idade);
			JOptionPane.showMessageDialog(null, i > 16? i+ " anos, ta velho cara" : i+ " anos, sai daqui, vc e criança");
		}else {
			JOptionPane.showMessageDialog(null, "Beleza entao otario, flw");
		}
		
	}
	
}
