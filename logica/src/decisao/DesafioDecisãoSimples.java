package decisao;

import javax.swing.JOptionPane;

public class DesafioDecis�oSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Ter� que inputar: nome de uma pessoa e a idade
 * Dever� exibir uma das mensagens:
 * maior que 70 anos, ou igual a 16 ou 17 => "Voto Facultativo"
 * menor de 16 anos "N�o vota"
 * se estiver entre 18 e 70 => "Obrigado a votar"
  */
		
		String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		
		if (idade<16) {
			System.out.println(nome+ " Voc� n�o pode votar: ");
		}
		
		if (idade>=18 && idade<70) {
			System.out.println(nome+ " Voc� � obrigado a votar: ");
		}
		
		
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println(nome + " O seu voto Facultativo: ");
		}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
