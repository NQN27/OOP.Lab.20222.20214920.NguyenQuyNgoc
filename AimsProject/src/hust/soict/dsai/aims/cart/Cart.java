package hust.soict.dsai.aims.cart;
import java.util.*;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	private ArrayList<Media> itemsCart = new ArrayList<Media>();
	
	public void addMedia(Media mda) {
		if(this.itemsCart.contains(mda)) {
			System.out.println("Already in");
		}
	this.itemsCart.add(mda);
	System.out.println("Add successfully");
	}
	public void removeMedia(Media mda) {
		if (this.itemsCart.contains(mda)) {
			this.itemsCart.remove(mda);
			System.out.println("Remove successfully");
			
			}
		System.out.println("Not found");
		return;
	}
	public void showMedia() {
		System.out.println("Number of Media in cart is "+ this.itemsCart.size());
		for (int i=0; i<this.itemsCart.size();i++) {
			System.out.println(this.itemsCart.get(i));
		}
	}
	public float totalCost() {
		float totalcost = 0f;
		for (int i=0; i<this.itemsCart.size();i++) {
			totalcost +=this.itemsCart.get(i).getCost();
		}
		return totalcost;
	}

	public void addMedia(Media dvd1,Media dvd2){
		addMedia(dvd1);
		addMedia(dvd2);
	}


	public void searchTitle(String title) {
		for (int i=0;i<this.itemsCart.size();i++) {
			if (this.itemsCart.get(i).isMatch(title)) {
				System.out.print(this.itemsCart.get(i));
				return;
			}
		}
		System.out.println("No match is found");
	}
	public void printout() {

		System.out.println("***********************CART***********************"+"\n"+"Ordered Items: \n");
		for (int i=0;i<this.itemsCart.size();i++) {
			System.out.println(this.itemsCart.get(i));

		}
		System.out.println("Total cost: "+Cart.this.totalCost()+"\n***************************************************");
		
	}
}
	