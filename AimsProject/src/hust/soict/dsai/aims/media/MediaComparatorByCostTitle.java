package hust.soict.dsai.aims.media;
import java.util.Comparator;
public class MediaComparatorByCostTitle implements Comparator<Media> {

	public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}
	public int compare(Media md1,Media md2) {
		if (md1.getCost()>md2.getCost()) {return 1;}
		else if (md1.getCost()==md2.getCost()) {
			return md1.getTitle().compareTo(md2.getTitle());
		}
		
		
		else {return -1;}
	}

}
