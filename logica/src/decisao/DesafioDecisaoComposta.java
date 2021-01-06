package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {

/*Input: produto - qtde - valor unitário
 * Preciso avaliar o estoque:
 * se a qtde estiver entre 10 e 20 - valor unitário terá 10% de redução
 * se a qtde estiver entre 5 e 9 - o valor unitário terá 5% de redução
 * se a qtde for menor que 5 - sem redução
 * se a qtde for maior que 20 - 12% de redução
 * 
 * No final exibir o valor do produto atualizado
 */
	
		String produto = JOptionPane.showInputDialog("Produto:").toUpperCase();	
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor Unitário:"));
				
		if (qtde>20) {
			valor = valor * (float)0.88;
		} else if (qtde>=10 && qtde<=20) {
			valor = valor * (float)0.9;
		} else if (qtde>=5 && qtde<=9) {
			valor = valor * (float)0.95;
		} 
			System.out.println("O valor do produto: " + produto + " é: R$" + valor);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
