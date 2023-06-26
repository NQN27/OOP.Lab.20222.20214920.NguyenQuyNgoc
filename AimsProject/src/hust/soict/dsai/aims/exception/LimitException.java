package hust.soict.dsai.aims.exception;

import javax.swing.JOptionPane;

public class LimitException extends Exception {

	public LimitException() {
		
	}

	public LimitException(String string) {
		JOptionPane.showMessageDialog(null, string,"Error", JOptionPane.INFORMATION_MESSAGE);

}
}

// This exception is thrown when passing a certain limit.