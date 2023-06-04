package hust.soict.dsai.aims.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
public class testAll {
	private static Store store = new Store();
	private static Cart cart = new Cart();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		store.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		store.addMedia(dvd3);
		Book b1 = new Book("Wolf of Wall Street", "Comedy", 24.95f,"Martin Scorsese");
		store.addMedia(b1);
		CompactDisc cd1 = new CompactDisc("Star Wars", "theme song", 30f, "George Lucas", "George Lucas");
		Track t1 = new Track("theme 1", 10);
		cd1.addTrack(t1);
		store.addMedia(cd1);
		store.showMedia();
	}

}
