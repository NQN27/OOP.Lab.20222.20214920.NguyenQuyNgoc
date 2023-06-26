package hust.soict.dsai.aims.screen;
import javax.swing.JOptionPane;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.LengthException;
import hust.soict.dsai.aims.exception.LimitException;
import hust.soict.dsai.aims.exception.NegativeException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
public class ViewScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk1 = null;
		try {
			bk1 = new Book("asdas","asdasd",30f,"addd");
		} catch (NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DigitalVideoDisc dvd1 = null;
		try {
			dvd1 = new DigitalVideoDisc("heelo","hello","hi",90,30f);
		} catch (NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DigitalVideoDisc dvd2 = null;
		try {
			dvd2 = new DigitalVideoDisc("heeeelo","heeello","hi",100,350f);
		} catch (NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Store store = new Store();
		Cart myCart = new Cart();
		store.addMedia(dvd1);
		store.addMedia(bk1);
		store.addMedia(dvd2);
		new CartScreen(myCart,store);
	}

}
