package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		while (nome.length()<5 || nome.length()>20 || nome.contains(" ")==false) {
			nome = JOptionPane.showInputDialog("Digite o nome novamente").toUpperCase();
		}

		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		while (idade<18 || idade>80) {
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade deve esstar entre 18 e 80 anos"));
		}

		System.out.println("Nome completo: " + nome);
		System.out.println("Idade: " + idade);

	}
}