package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		String entrada;
		int cont = 0;
		
		entrada = JOptionPane.showInputDialog("Digite um n�mero: ");
		int num = Integer.parseInt(entrada);
		
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				cont = cont + 1;
			}
		}
		
		if(cont == 2) {
			JOptionPane.showMessageDialog(null, "O n�mero " + num + " � primo.");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero " + num + " n�o � primo.");
		}

	}

}
