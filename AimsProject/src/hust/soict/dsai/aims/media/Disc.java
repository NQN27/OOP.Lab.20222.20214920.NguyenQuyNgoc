package hust.soict.dsai.aims.media;
import java.time.LocalDate;
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
	public Disc(int id, String title, String category, float cost, LocalDate Date,int length,String director) {
		super(id,title,category,cost,Date);
		this.length = length;
		this.director = director;
	}
}