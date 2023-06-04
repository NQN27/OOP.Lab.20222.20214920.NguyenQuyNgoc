package hust.soict.dsai.aims.cart;
import java.util.*;
import hust.soict.dsai.aims.media.Media;
import java.util.Collections;
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
	public ArrayList<Media> searchMedia(String title){
		ArrayList<Media> listSearch = new ArrayList<Media>();
		for (int i=0; i<this.itemsCart.size();i++) {
			if (this.itemsCart.get(i).getTitle().equals(title)) {
				listSearch.add(this.itemsCart.get(i));
			}
		}
		if (listSearch.size()==0) {
			System.out.println("Not found");
		}
		else {
			for (int i=0; i<listSearch.size();i++) {
				System.out.println(listSearch.get(i)+"/n");
			}
		}
		return listSearch;
	}
	public ArrayList<Media> searchMediaID(int id){
		ArrayList<Media> listSearch = new ArrayList<Media>();
		for (int i=0; i<this.itemsCart.size();i++) {
			if (this.itemsCart.get(i).getId()==id) {
				listSearch.add(this.itemsCart.get(i));
			}
		}
		if (listSearch.size()==0) {
			System.out.println("Not found");
		}
		else {
			for (int i=0; i<listSearch.size();i++) {
				System.out.println(listSearch.get(i)+"/n");
			}
		}
		return listSearch;
	}
	public void  SortbyTitleCost() {
		Collections.sort(itemsCart,Media.COMPARATOR_BY_TITLE_COST);
	}
	public void  SortbyCostTitle() {
		Collections.sort(itemsCart,Media.COMPARATOR_BY_COST_TITLE);
	}
	public void clear() {
		itemsCart.clear();
	}
}
	