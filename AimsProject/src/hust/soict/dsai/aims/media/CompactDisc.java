package hust.soict.dsai.aims.media;
import java.util.List;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Track;
public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc( String title, String category, float cost,String director, String artist) {
		super(title,category,cost,0,director);
		this.artist = artist;
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track trk) {
		if (tracks.contains(trk)){
				System.out.println("Already inside");
				return;
			
		}
		tracks.add(trk);
		this.setLength(this.getLength() + trk.getLength());
		System.out.println("Add Track successfully");
	}
	public void removeTrack(Track trk) {
		if (tracks.contains(trk)) {
				System.out.println("Already inside");
				tracks.remove(trk);
				this.setLength(this.getLength() - trk.getLength());
				System.out.println("Remove Track successfully");
				return;
		}
		System.out.println("No Track to Remove");
	}
	public void play() {
		for (int i=0;i<this.tracks.size();i++) {
			tracks.get(i).play();
		}
	}
	public boolean equals(Object obj) {
		if (obj instanceof CompactDisc) {
			if (((CompactDisc) obj).getTitle().equals(this.getTitle())) {
				return true;
			}
		}
		return false;
	}
	public String toString() {
		String alltrack = "";
		for(int i=0;i<this.tracks.size();i++) {
			alltrack=alltrack+this.tracks.get(i)+" ";
		}
		return this.getId()+"CD-"+this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLength()+" :"+this.getCost()+alltrack+" $ \n";}
}
