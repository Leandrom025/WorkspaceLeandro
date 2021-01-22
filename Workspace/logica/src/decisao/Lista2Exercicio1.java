package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {

		byte diarias = Byte.parseByte(JOptionPane.showInputDialog("Quantidade de Diárias: "));
		float taxa = (float) 5.5;
		if (diarias==15) {
			taxa = (float) 6;
		} else if (diarias<15) {
			taxa = 8;
			
		}

		System.out.println("Total da reerva: " + (80+taxa)*diarias);
		
		
		
		
		
		
		

	}

}
