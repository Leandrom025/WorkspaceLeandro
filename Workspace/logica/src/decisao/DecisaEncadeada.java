package decisao;

import javax.swing.JOptionPane;

public class DecisaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//&& => and
		//||=> or
		// acrescentar as faltas, aprova��o do aluno = media e falta (menor que 20)
		// Exame = media e falta
		// falta maior ou igual a 20 est� reprovado

		String disciplina = JOptionPane.showInputDialog("Disciplina:");
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas:"));

		if (faltas>=20) {
			System.out.println("Voc� est� reprovado por faltas na disciplina " + disciplina);
		}else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			float media = (nota1+nota2)/2;
			if (media>=6) {
				System.out.println("Parab�ns voc� foi aprovado na disciplina: " + disciplina);
			}else if (media<4 ) {
				System.out.println("Infelizmente voc� foi reprovado na disciplina: " + disciplina);
			}else {
				System.out.println("Voc� tem uma chance no exame da disciplina: " + disciplina);
			}

			System.out.println("M�dia:" + media);

		}








	}

}
