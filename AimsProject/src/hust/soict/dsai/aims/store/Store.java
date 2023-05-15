package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private int MAX_DISC=1000;
	private DigitalVideoDisc itemsStore[] = new DigitalVideoDisc[MAX_DISC];
	private int  qtyOrdered =0;
	
	public void addDVD(DigitalVideoDisc dvd1) {
		int i =0;
		while (this.itemsStore[i] != null) {
			i++;
			if (i>=MAX_DISC) {
				System.out.println("Store is full");
				return;
		}
		}
		this.itemsStore[i] = dvd1;
		System.out.println("Add successfully");
		qtyOrdered+=1;
	}
	public void removeDVD(DigitalVideoDisc dvd1) {
		int i =0;
		while (this.itemsStore[i]!=dvd1) {
			i++;
			if (i>MAX_DISC) {break;}
		}
		if (i>MAX_DISC) {
			System.out.println("Delete Unsuccessfully");
		}
		else {
			this.itemsStore[i] = null;
			System.out.println("Delete successfully");
			qtyOrdered-=1;
		}
		
	}
	
}

