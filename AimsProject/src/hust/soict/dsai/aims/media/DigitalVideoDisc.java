package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
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
	public boolean isMatch(String title1) {
		if (this.getTitle() ==title1) {return true;}
		else { return false;}
	}


}

