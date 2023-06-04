package hust.soict.dsai.aims.media;
import java.util.Comparator;
public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int idsetvalue=0;
	public static int getIdsetvalue() {
		return idsetvalue;
	}
	public static void setIdsetvalue(int idsetvalue) {
		Media.idsetvalue = idsetvalue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public boolean isMatch(String title1) {
		if (this.getTitle() ==title1) {return true;}
		else { return false;}
	}
	public Media(String title, String category, float cost) {
		this.id = idsetvalue++;
		this.title = title;
		this.category = category;
		this.cost = cost;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Id "+this.getId()+" Title:"+this.getTitle()+" Category:"+this.getCategory()+" Cost:"+this.getCost();
	}
	public static final Comparator<Media> COMPARATOR_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARATOR_BY_COST_TITLE = new MediaComparatorByCostTitle();

}
