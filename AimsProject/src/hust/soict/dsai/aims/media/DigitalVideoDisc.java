package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.LengthException;
import hust.soict.dsai.aims.exception.NegativeException;
import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	public DigitalVideoDisc(String title) throws NegativeException, LengthException {
		super(title,null,0,0, null);
		
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) throws NegativeException, LengthException {
		super(title,category,cost,length, director);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) throws NegativeException, LengthException {
		super(title,category,cost,0, director);
	}
	public DigitalVideoDisc(String title, String category, float cost) throws NegativeException, LengthException {
		super(title,category,cost,0, null);
	}


	public String toString() {
		return this.getId()+".DVD-"+this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLength()+" :"+this.getCost()+" $";
	}
	public int play() throws PlayerException {
		if (this.getLength() <=0) {
			throw new PlayerException("Length is negative");
		}
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
		return this.getLength();
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

