package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
	private String director = null;
	private int length = 0; 
	private static int nbDigitalVideoDisc=0;


	private int id = 0;

	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(String title) {
		super();
		setTitle(title);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		this.director = director;
		this.length = length;
		setCost(cost);
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		this.director = director;
		setCost(cost);
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		setCost(cost);
		nbDigitalVideoDisc++;
		this.id = nbDigitalVideoDisc;
	}
	public static int getNbDigitalVideoDisc() {
		return nbDigitalVideoDisc;
	}
	public static void setNbDigitalVideoDisc(int nbDigitalVideoDisc) {
		DigitalVideoDisc.nbDigitalVideoDisc = nbDigitalVideoDisc;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String toString() {
		return this.id+".DVD-"+this.getTitle()+" - "+this.getCategory()+" - "+this.director+" - "+this.length+" :"+this.getCost()+" $";
	}
	public boolean isMatch(String title1) {
		if (this.getTitle() ==title1) {return true;}
		else { return false;}
	}


}

