package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private List<Media> itemsStore = new ArrayList<Media>();
	private int qtyStore =0;
	
	public void addDVD(Media md1) {
		if (itemsStore.contains(md1)) {
			System.out.println("Already in");
			return;
		}
		this.itemsStore.add(md1);
			
		System.out.println("Add successfully");
		this.qtyStore+=1;
	}
	public void removeDVD(Media md1) {
		if (itemsStore.contains(md1)) {
			this.itemsStore.remove(md1);
			System.out.println("Remove successfully");
			this.qtyStore-=1;
			return;
		}
			
		System.out.println("Not found");
		}
		
	}
	


