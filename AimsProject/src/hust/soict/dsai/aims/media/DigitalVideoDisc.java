package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	public DigitalVideoDisc(String title) {
		super(title,null,0,0, null);
		
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost,length, director);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,cost,0, director);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title,category,cost,0, null);
	}


	public String toString() {
		return this.getId()+".DVD-"+this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLength()+" :"+this.getCost()+" $";
	}
	public void play() {
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
	}
	public boolean equals(Object obj) {
		if (obj instanceof DigitalVideoDisc) {
			if (((DigitalVideoDisc) obj).getTitle().equals(this.getTitle())) {
				return true;
			}
		}
		return false;
	}
}

