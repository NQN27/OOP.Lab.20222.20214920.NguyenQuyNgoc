package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.LengthException;
import hust.soict.dsai.aims.exception.NegativeException;
import hust.soict.dsai.aims.exception.PlayerException;

public class Disc extends Media{
	private int length;
	private String director;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Disc(String title, String category, float cost,int length,String director) throws NegativeException,LengthException {
		super(title,category,cost);
		this.length = length;
		this.director = director;
		if (length<0) {
			throw new LengthException();
		}
	}
	public String toString() {
		return "Id "+this.getId()+" Title:"+this.getTitle()+" Category:"+this.getCategory()+" Director:"+this.getDirector()+" Cost:"+this.getCost();
	}
	public int play() throws  PlayerException {
		if (this.length<=0) {
			throw new PlayerException("Length is negative");
		}
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
		return this.length;
	}
}