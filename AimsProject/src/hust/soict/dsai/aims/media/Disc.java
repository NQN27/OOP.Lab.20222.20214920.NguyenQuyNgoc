package hust.soict.dsai.aims.media;
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
	public Disc(String title, String category, float cost,int length,String director) {
		super(title,category,cost);
		this.length = length;
		this.director = director;
	}
	public String toString() {
		return "Id "+this.getId()+" Title:"+this.getTitle()+" Category:"+this.getCategory()+" Director:"+this.getDirector()+" Cost:"+this.getCost();
	}
	public void play() {
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
	}
}