package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class testCart {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		Book b1 = new Book("Aladin", "tale", 24.95f);
		CompactDisc cd1 = new CompactDisc("Star Wars", "theme song", 30f, "George Lucas", "George Lucas");
		Track t1 = new Track("theme 1", 10);
		cd1.addTrack(t1);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.showDigitalVideoDisc();
		anOrder.addDigitalVideoDisc(dvd3,dvd1);
		anOrder.printout();
		anOrder.searchTitle("Aladin");
	}
}
