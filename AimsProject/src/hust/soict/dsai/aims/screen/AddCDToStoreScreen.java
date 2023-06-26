package hust.soict.dsai.aims.screen;

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
import hust.soict.dsai.aims.exception.LengthException;
import hust.soict.dsai.aims.exception.NegativeException;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class AddCDToStoreScreen extends AddItemToStoreScreen {

	public AddCDToStoreScreen(Store store,Cart cart) {
		// TODO Auto-generated constructor stub
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
        tf.add(new Label("Artist"));
        JTextField artisttb = new JTextField(20);	
        tf.add(artisttb);
        tf.add(new Label("Director"));
        JTextField drttb = new JTextField(20);	
        tf.add(drttb);
        tf.add(new Label("Tracklist(Seperated by ,Track: name:length)"));
        JTextField tracklisttb = new JTextField(20);	
        tf.add(tracklisttb);
        JButton btncf = new JButton("CONFIRM");
        btncf.addActionListener(e ->{
        	CompactDisc cd = null;
			try {
				cd = new CompactDisc(titletb.getText(), categorytb.getText(), Float.parseFloat(costtb.getText()), drttb.getText(),artisttb.getText());
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
        	ArrayList<String> alltrack = new ArrayList<String>(Arrays.asList(tracklisttb.getText().split(",")));
        	for (String atrack:alltrack) {
        		ArrayList<String> track = new ArrayList<String>(Arrays.asList(atrack.split(":")));
        		try {
        			Track track_add = new Track(track.get(0).trim(),Integer.parseInt(track.get(1)));
        			cd.addTrack(track_add);
        		}
        		catch(Exception ex) {
        			System.err.println(ex.getMessage());
        		}
        		try {
                    this.store.addMedia(cd);
                    JOptionPane.showMessageDialog(null, cd.getTitle() + " was added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    new AddCDToStoreScreen( store, cart);
                    dispose();
                	}
                	catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Warning", JOptionPane.ERROR_MESSAGE);}
        	}
        	
		// TODO Auto-generated method stub
        });
        tf.add(btncf);
		return tf;
	}


}
