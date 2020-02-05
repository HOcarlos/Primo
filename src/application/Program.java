package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		String entrada;
		int cont = 0;
		
		entrada = JOptionPane.showInputDialog("Digite um número: ");
		int num = Integer.parseInt(entrada);
		
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				cont = cont + 1;
			}
		}
		
		if(cont == 2) {
			JOptionPane.showMessageDialog(null, "O número " + num + " é primo.");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + num + " não é primo.");
		}

	}

}
