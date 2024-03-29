package aims;
public class Cart {
	public static final int MAX_NUMBER =20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER];
	private int  qtyOrdered =0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered == MAX_NUMBER){
			System.out.println("Your cart is full! Can't add more.");
			return;
		}
		this.itemsOrdered[this.qtyOrdered] = disc;
		System.out.println("You successfully add DVD to cart");
		this.qtyOrdered+=1;
		if (this.qtyOrdered >=(MAX_NUMBER-3)) {
			System.out.println("You have only"+(MAX_NUMBER-this.qtyOrdered)+" place left.");
			return;
	}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered == 0) {
			System.out.println("No DVD to remove");
			return;
		}
		for (int i=0; i<this.qtyOrdered;i++) {
			if (this.itemsOrdered[i] == null) {
				System.out.println("Not finding DVD to remove");
				break;
			}
			if (this.itemsOrdered[i].equals(disc)) {
				for (int j=i;j<this.qtyOrdered;j++) {
					if (j == MAX_NUMBER) {
						this.itemsOrdered[j]=null;
						break;
					}
					this.itemsOrdered[j]=this.itemsOrdered[j+1];
				}
				System.out.println("Remove successfully");
				this.qtyOrdered-=1;
			}
		}
	}
	public void showDigitalVideoDisc() {
		System.out.println("Number of disc in cart is "+ this.qtyOrdered);
		for (int i=0; i<this.qtyOrdered;i++) {
			System.out.println("Title:"+this.itemsOrdered[i].getTitle()+", Category: "+this.itemsOrdered[i].getCategory()+", Director: "+this.itemsOrdered[i].getDirector()+", Length: "+this.itemsOrdered[i].getLength()+", Cost:"+this.itemsOrdered[i].getCost());
		}
	}
	public float totalCost() {
		float totalcost = 0f;
		for (int i=0; i<this.qtyOrdered;i++) {
			totalcost +=this.itemsOrdered[i].getCost();
		}
		return totalcost;
	}
}
	