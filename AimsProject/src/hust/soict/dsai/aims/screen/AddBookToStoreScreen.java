package hust.soict.dsai.aims.screen;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.NegativeException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen{
	public AddBookToStoreScreen(Store store,Cart cart) {
		super(store,cart);
	}

	@Override
	JPanel createBody() {
		JPanel tf = new JPanel();
		tf.setLayout(new GridLayout(0,2,2,4));
		tf.add(new Label("Title"));
        JTextField titletb = new JTextField(20);	
        tf.add(titletb);

        tf.add(new Label("Category"));
        JTextField categorytb = new JTextField(20);	
        tf.add(categorytb);

        tf.add(new Label("Cost"));
        JTextField costtb = new JTextField(20);	
        tf.add(costtb);

        tf.add(new Label("Author (Seperated by ,)"));
        JTextField authortb = new JTextField(20);
        tf.add(authortb);

        JButton btncf = new JButton("CONFIRM");
        btncf.addActionListener(e ->{
        	ArrayList<String> authors = new ArrayList<String>(Arrays.asList(authortb.getText().split(",")));

        	Book book = null;
			try {
				book = new Book(titletb.getText(),categorytb.getText(),Float.parseFloat(costtb.getText()),authors);
				try {
		            this.store.addMedia(book);
		            JOptionPane.showMessageDialog(null, book.getTitle() + " was added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
		        	new AddBookToStoreScreen(store,cart);
		        	dispose();
		        	}
		        	catch(Exception ex) {
		            JOptionPane.showMessageDialog(null, ex.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NegativeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		// TODO Auto-generated method stub
        });
        tf.add(btncf);
		return tf;
	}

}
