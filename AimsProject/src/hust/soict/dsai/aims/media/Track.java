package hust.soict.dsai.aims.media;

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
	public void play() {
		System.out.println("Playing DVD: "+ this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
	}
}
