package repeticao;

import javax.swing.JOptionPane;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
do {
int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
	JOptionPane.showMessageDialog (null, "Resultado: " + (valor1+valor2));
	
}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);

	
	}
    }
