package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {

/*Input: produto - qtde - valor unit�rio
 * Preciso avaliar o estoque:
 * se a qtde estiver entre 10 e 20 - valor unit�rio ter� 10% de redu��o
 * se a qtde estiver entre 5 e 9 - o valor unit�rio ter� 5% de redu��o
 * se a qtde for menor que 5 - sem redu��o
 * se a qtde for maior que 20 - 12% de redu��o
 * 
 * No final exibir o valor do produto atualizado
 */
	
		String produto = JOptionPane.showInputDialog("Produto:").toUpperCase();	
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor Unit�rio:"));
				
		if (qtde>20) {
			valor = valor * (float)0.88;
		} else if (qtde>=10 && qtde<=20) {
			valor = valor * (float)0.9;
		} else if (qtde>=5 && qtde<=9) {
			valor = valor * (float)0.95;
		} 
			System.out.println("O valor do produto: " + produto + " �: R$" + valor);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
