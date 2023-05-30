package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.*;
import hust.soict.dsai.aims.media.Track;
public class CompactDisc extends Disc {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc(int id, String title, String category, float cost, LocalDate date,String director, String artist) {
		super(id,title,category,cost,date,0,director);
		this.artist = artist;
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track trk) {
		for (int i=0;i<tracks.size();i++) {
			if (trk.equals(tracks.get(i))) {
				System.out.println("Already inside");
				return;
			}
		}
		tracks.add(trk);
		this.setLength(this.getLength() + trk.getLength());
		System.out.println("Add Track successfully");
	}
	public void removeTrack(Track trk) {
		for (int i=0;i<tracks.size();i++) {
			if (trk.equals(tracks.get(i))) {
				System.out.println("Already inside");
				tracks.remove(i);
				this.setLength(this.getLength() - trk.getLength());
				System.out.println("Remove Track successfully");
				return;
			}
		}
		System.out.println("No Track to Remove");
	}
}
