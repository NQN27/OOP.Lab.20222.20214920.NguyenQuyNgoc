package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.exception.LimitException;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Cart  {

	private ObservableList<Media> itemsCart = FXCollections.observableArrayList();
	int MAX_NUMBER_ORDER = 20;
	public void addMedia(Media mda) throws LimitException {
		if (this.itemsCart.size()>20) {
			throw new LimitException("Max number reach");
		}
	this.itemsCart.add(mda);
	System.out.println("Add successfully");
	}
	public void removeMedia(Media mda) {
		if (this.itemsCart.contains(mda)) {
			this.itemsCart.remove(mda);
			System.out.println("Remove successfully");
			return;
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

	public void addMedia(Media dvd1,Media dvd2) throws LimitException{
		try {
		addMedia(dvd1);
		addMedia(dvd2);}
		catch (LimitException ex) {
			System.out.println("Out of range");
		}
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
	public ObservableList<Media> getItemsOrdered() {
		// TODO Auto-generated method stub
		return this.itemsCart;
	}
	public int getSize() {
		return this.itemsCart.size();
	}
}
	