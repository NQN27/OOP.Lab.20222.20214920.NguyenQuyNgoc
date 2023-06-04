package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Media;
public class Store {
	private List<Media> itemsStore = new ArrayList<Media>();
	
	public void addMedia(Media md1) {
		if (itemsStore.contains(md1)) {
			System.out.println("Already in");
			return;
		}
		this.itemsStore.add(md1);
			
		System.out.println("Add successfully");
	}
	public void removeMedia(Media md1) {
		if (itemsStore.contains(md1)) {
			this.itemsStore.remove(md1);
			System.out.println("Remove successfully");
			return;
		}
			
		System.out.println("Not found");
		}
	public void showMedia() {
		System.out.println("Number of Media in cart is "+ this.itemsStore.size());
		for (int i=0; i<this.itemsStore.size();i++) {
			System.out.println(this.itemsStore.get(i));
	}
	}
	public ArrayList<Media> searchMedia(String title){
		ArrayList<Media> listSearch = new ArrayList<Media>();
		for (int i=0; i<this.itemsStore.size();i++) {
			if (this.itemsStore.get(i).getTitle().equals(title)) {
				listSearch.add(this.itemsStore.get(i));
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
		for (int i=0; i<this.itemsStore.size();i++) {
			if (this.itemsStore.get(i).getId()==id) {
				listSearch.add(this.itemsStore.get(i));
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
		
}

