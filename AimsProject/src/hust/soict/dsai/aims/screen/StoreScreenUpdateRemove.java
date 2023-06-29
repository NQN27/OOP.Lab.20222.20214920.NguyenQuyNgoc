package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreScreenUpdateRemove extends StoreScreen {

	public StoreScreenUpdateRemove(Cart cart, Store store) {
		super(cart, store);
		// TODO Auto-generated constructor stub
		
	}
	   JPanel createCenter() {
			JPanel center = new JPanel();
			center.setLayout(new GridLayout(3,3,2,2));
			
			ArrayList<Media> mediaInStore = store.getItemsInStore();
			for (int i=0;i<mediaInStore.size();i++) {
				System.out.println(mediaInStore.get(i));
				MediaStoreUpdate cell = new MediaStoreUpdate(mediaInStore.get(i),this.cart,this.store);
				center.add(cell);
			}
			return center;
		

}
		JMenuBar createMenuBar() {
			JMenu menu = new JMenu("Options");
			JMenuItem viewstore = new JMenuItem("View store");
			viewstore.addActionListener(e-> {
				this.dispose();
				new StoreScreen(this.cart,this.store);
			});
			menu.add( viewstore);
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
}