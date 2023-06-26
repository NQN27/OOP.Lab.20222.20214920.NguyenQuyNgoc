package hust.soict.dsai.aims.screen;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.LengthException;
import hust.soict.dsai.aims.exception.NegativeException;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
public class StoreScreen extends JFrame {
	private Store store;
	private Cart cart;
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		JMenu smUpdateStore = new JMenu("Update Store");
		JMenuItem addbook =  new JMenuItem("Add Book");
		addbook.addActionListener(e-> {
			new AddBookToStoreScreen(store,cart);
			dispose();
		});
		smUpdateStore.add(addbook);
		JMenuItem addcd =  new JMenuItem("Add CD");
		addcd.addActionListener(e-> {
			new AddCDToStoreScreen(store,cart);
			dispose();
		});
		smUpdateStore.add(addcd);
		JMenuItem adddvd =  new JMenuItem("Add DVD");
		adddvd.addActionListener(e-> {
			new AddDVDToStoreScreen(store,cart);
			dispose();
		});
		smUpdateStore.add(adddvd);
		menu.add(smUpdateStore);
		menu.add( new JMenuItem("View store"));
		JMenuItem viewcart = new JMenuItem("View cart");
		viewcart.addActionListener(e ->{
			this.dispose();
			new CartScreen(this.cart,this.store);
			
		});
		menu.add( viewcart);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		return menuBar;
	}
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		JButton cartbtn = new JButton("View cart");
		cartbtn.setPreferredSize(new Dimension(100,50));
		cartbtn.setMaximumSize(new Dimension(100,50));
		cartbtn.addActionListener(e ->{
			this.dispose();
			new CartScreen(this.cart,this.store);
			
		});
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cartbtn);
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}
	   JPanel createCenter() {
			JPanel center = new JPanel();
			center.setLayout(new GridLayout(3,3,2,2));
			
			ArrayList<Media> mediaInStore = store.getItemsInStore();
			for (int i=0;i<mediaInStore.size();i++) {
				System.out.println(mediaInStore.get(i));
				MediaStore cell = new MediaStore(mediaInStore.get(i),this.cart);
				center.add(cell);
			}
			
			return center;
		}	
	public StoreScreen(Cart cart,Store store) {
		this.cart = cart;
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(),BorderLayout.NORTH);
		cp.add(createCenter(),BorderLayout.CENTER);
		setTitle("Store");
		setVisible(true);
		setSize(1024,768);
	}
	
	public static void main(String[] args) throws NegativeException, LengthException {
		Media md1 = new Media("asda","sdad",10);
		
		// TODO Auto-generated method stub
		Store str1 = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87,19.25f);
		str1.addMedia(dvd1);
				
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87,24.95f);
		str1.addMedia(dvd2);
		str1.addMedia(md1);
		Cart ct1 = new Cart();
		StoreScreen st = new StoreScreen(ct1,str1);
		

	}

}
