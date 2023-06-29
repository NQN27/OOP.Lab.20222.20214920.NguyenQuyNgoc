package hust.soict.dsai.aims.exception;

import javax.swing.JOptionPane;

public class ErrorTypeInput extends Exception {
	public ErrorTypeInput(String string) {
		JOptionPane.showMessageDialog(null, string,"Error", JOptionPane.INFORMATION_MESSAGE);
}
}
