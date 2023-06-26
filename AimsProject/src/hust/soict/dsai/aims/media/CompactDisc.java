package hust.soict.dsai.aims.media;
import java.util.List;

import hust.soict.dsai.aims.exception.LengthException;
import hust.soict.dsai.aims.exception.NegativeException;
import hust.soict.dsai.aims.exception.PlayerException;

import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc( String title, String category, float cost,String director, String artist) throws NegativeException, LengthException {
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
	public int play() {
		int totalLength =0;
		for (int i=0;i<this.tracks.size();i++) {
			try {
				totalLength+=tracks.get(i).play();
			} catch (PlayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return totalLength;
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
			alltrack=alltrack+"name track: "+this.tracks.get(i).getTitle()+"- Length: "+this.tracks.get(i).getLength();
		}
		return this.getId()+"CD-"+this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLength()+" :"+this.getCost()+" $ -"+alltrack;}
}
