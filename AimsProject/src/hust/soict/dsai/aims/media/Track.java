package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable{
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Track(String title,int length) {
		this.title = title;
		this.length = length;
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Object obj) {
		if (obj instanceof Track) {
			Track Track_obj = (Track) obj;
			if ((Track_obj.title.equals(this.title)) && (Track_obj.length == this.length)) {
				return true;
			}
		}
		return false;
	}
	public int play() throws PlayerException  {
		if(this.length<=0) {
			throw new PlayerException("Length is negative");
		}
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
		return this.getLength();
		
	}
}
