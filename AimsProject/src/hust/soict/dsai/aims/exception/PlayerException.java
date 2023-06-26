package hust.soict.dsai.aims.exception;

import javax.swing.JOptionPane;

public class PlayerException extends Exception{
	public PlayerException(String string) {
		JOptionPane.showMessageDialog(null, string,"Error", JOptionPane.INFORMATION_MESSAGE);

	}
}
