package aula2;

import javax.swing.JOptionPane;

public class Swing {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showMessageDialog(null, nome, "Olá", JOptionPane.INFORMATION_MESSAGE);
	}
}
