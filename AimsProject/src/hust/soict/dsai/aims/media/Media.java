package hust.soict.dsai.aims.media;
import java.time.LocalDate;
public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private LocalDate Date;
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
	public void setDate(LocalDate date) {
		this.Date = date;

	}
	public Media() {
		// TODO Auto-generated constructor stub
	}

}
