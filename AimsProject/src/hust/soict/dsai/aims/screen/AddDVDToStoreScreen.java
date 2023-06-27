package hust.soict.dsai.aims.screen;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.LengthException;
import hust.soict.dsai.aims.exception.NegativeException;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AddDVDToStoreScreen extends AddItemToStoreScreen {

	public AddDVDToStoreScreen(Store store, Cart cart) {
		super(store,cart);
		// TODO Auto-generated constructor stub
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
        tf.add(new Label("Length"));
        JTextField Lengthtb = new JTextField(20);	
        tf.add(Lengthtb);
        tf.add(new Label("Director"));
        JTextField drttb = new JTextField(20);	
        tf.add(drttb);
        JButton btncf = new JButton("CONFIRM");
        btncf.addActionListener(e ->{
        	DigitalVideoDisc dvd = null;
			try {
				dvd = new DigitalVideoDisc(titletb.getText(),categorytb.getText(),drttb.getText(),Integer.parseInt(Lengthtb.getText()),Float.parseFloat(costtb.getText()));
	        	try {
	                this.store.addMedia(dvd);
	                JOptionPane.showMessageDialog(null, dvd.getTitle() + " was added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
	                new AddDVDToStoreScreen(store,cart);
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
			} catch (LengthException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

        });
        tf.add(btncf);
		// TODO Auto-generated method stub
		return tf;
	}

}
