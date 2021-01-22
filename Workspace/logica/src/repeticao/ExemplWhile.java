package repeticao;

import javax.swing.JOptionPane;

public class ExemplWhile {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Digite o e-mail").toLowerCase();
		while (email.contains("@")==false) {

			email = JOptionPane.showInputDialog("E-mail Inválido. Tente novamente").toLowerCase();
		}
		System.out.println("Seja bem vindo: " + email.substring(0, email.indexOf("@")));




































	}

}
