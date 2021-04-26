package principal;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Principal MyInterfazP = new Principal();
		MyInterfazP.inicio();
	}

	public void inicio() {
		
		int numero=0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero","Numero",JOptionPane.PLAIN_MESSAGE));
		JOptionPane.showMessageDialog(null, "Numero: " + numero);
		
	}
	
}

