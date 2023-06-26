package hust.soict.dsai.aims.exception;

import javax.swing.JOptionPane;

public class NegativeException extends Exception {

	public NegativeException(String string) {
		JOptionPane.showMessageDialog(null, string,"Error", JOptionPane.INFORMATION_MESSAGE);
		// TODO Auto-generated constructor stub
	}

}
